package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionEmpController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class GestionEmpViewController {

    @FXML
    private Button btn_actualizarCliente;

    @FXML
    private TableColumn<Empleado, String> tbc_telefono;

    @FXML
    private TextField txf_nombre;

    @FXML
    private ImageView img_carro;

    @FXML
    private AnchorPane ap_gestionCliente;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<Empleado, String> tbc_nombre;

    @FXML
    private TextField txf_telefono;

    @FXML
    private TextField txf_cedula;

    @FXML
    private TextField txf_correo;

    @FXML
    private Button btn_agregarCliente;

    @FXML
    private TableView<Empleado> tb_listEmpleados;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Empleado, String> tbc_cedula;

    @FXML
    private TableColumn<Empleado, String> tbc_correo;

    @FXML
    void onVolver(ActionEvent event) {
        app.openAdministrador();
    }

    @FXML
    void onActualizar(ActionEvent event) {
        actualizarEmpleado();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        agregarEmpleado();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarEmpleado();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    
    GestionEmpController gestionEmpController;
    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        gestionEmpController = new GestionEmpController(app.consesionario);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerEmpleados();

        // Agregar los elementos a la tabla
        tb_listEmpleados.setItems(listEmpleados);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbc_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        tbc_telefono.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getTelefono())));
        tbc_correo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerEmpleados() {
        listEmpleados.addAll(gestionEmpController.obtenerListaEmpleados());
    }

    private void listenerSelection() {
        tb_listEmpleados.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedEmpleado = newSelection;
            mostrarInformacionEmpleado(selectedEmpleado);
        });
    }

    private void mostrarInformacionEmpleado(Empleado empleado) {
        if (empleado != null) {
            txf_cedula.setText(Integer.toString(empleado.getId()));
            txf_nombre.setText(empleado.getNombre());
            txf_telefono.setText(Integer.toString(empleado.getTelefono()));
            txf_correo.setText(empleado.getCorreo());
        }
    }
    

    private void agregarEmpleado() {
        Empleado empleado = buildEmpleado();
        if (gestionEmpController.crearEmpleado(empleado)) {
            listEmpleados.add(empleado);
            limpiarCamposEmpleado();
        }
    }

    private Empleado buildEmpleado() {
        int id = Integer.parseInt(txf_cedula.getText());
        int telefono = Integer.parseInt(txf_telefono.getText());
        Empleado empleado = new Empleado(txf_nombre.getText(), id, telefono, txf_correo.getText());
        return empleado;
    }

    private void eliminarEmpleado() {
        int id = Integer.parseInt(txf_cedula.getText()); // Convierte el texto a entero
        if (gestionEmpController.eliminarEmpleado(id)) { // Pasa el entero como argumento
            listEmpleados.remove(selectedEmpleado);
            limpiarCamposEmpleado();
            limpiarSeleccion();
        }
    }
    

    private void actualizarEmpleado() {
        if (selectedEmpleado != null && gestionEmpController.actualizarEmpleado(selectedEmpleado.getId(), buildEmpleado())) {
            int index = listEmpleados.indexOf(selectedEmpleado);
            if (index >= 0) {
                listEmpleados.set(index, buildEmpleado());
            }
            tb_listEmpleados.refresh();
            limpiarSeleccion();
            limpiarCamposEmpleado();
        }
    }

    private void limpiarSeleccion() {
        tb_listEmpleados.getSelectionModel().clearSelection();
        limpiarCamposEmpleado();
    }

    private void limpiarCamposEmpleado() {
        txf_cedula.clear();
        txf_nombre.clear();
        txf_telefono.clear();
        txf_correo.clear();
    }
}
