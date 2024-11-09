package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionClController;
import co.edu.uniquindio.poo.model.Cliente;
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
import javafx.scene.text.Text;

public class GestionClViewController {

    @FXML
    private Button btn_actualizarCliente;

    @FXML
    private TableColumn<Cliente, String> tbc_telefono;

    @FXML
    private TextField txf_nombre;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<Cliente, String> tbc_nombre;

    @FXML
    private TextField txf_telefono;

    @FXML
    private TextField txf_cedula;

    @FXML
    private TextField txf_correo;

    @FXML
    private Button btn_agregarCliente;

    @FXML
    private TableView<Cliente> tb_listClientes;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Cliente, String> tbc_cedula;

    @FXML
    private TableColumn<Cliente, String> tbc_reservasId;

    @FXML
    private TableColumn<Cliente, String> tbc_correo;

    @FXML
    void onVolver(ActionEvent event) {
        app.openEmpresa();
    }

    @FXML

    void onActualizar(ActionEvent event) {
        actualizarCliente();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        agregarCliente();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarCliente();

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    GestionClController gestionClController;
    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;

    @FXML
    void initialize() {
        gestionClController = new GestionClController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerClientes();

        // Agregar los elementos a la tabla
        tb_listClientes.setItems(listClientes);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbc_cedula.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCedula())));
        tbc_telefono.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getTelefono())));
        tbc_correo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerClientes() {
        listClientes.addAll(gestionClController.obtenerListaClientes());
    }

    private void listenerSelection() {
        tb_listClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }

    private void mostrarInformacionCliente(Cliente cliente) {
        if (cliente != null) {
            txf_cedula.setText(Integer.toString(cliente.getCedula()));
            txf_nombre.setText(cliente.getNombre());
            txf_telefono.setText(Integer.toString(cliente.getTelefono()));
            txf_correo.setText(cliente.getCorreo());
        }
    }
    

    private void agregarCliente() {
        Cliente cliente = buildCliente();
        if (gestionClController.crearCliente(cliente)) {
            listClientes.add(cliente);
            limpiarCamposCliente();
        }
    }

    private Cliente buildCliente() {
        int cedula = Integer.parseInt(txf_cedula.getText());
        int telefono = Integer.parseInt(txf_telefono.getText());
        Cliente cliente = new Cliente(txf_nombre.getText(), cedula, telefono, txf_correo.getText());
        return cliente;
    }

    private void eliminarCliente() {
        int cedula = Integer.parseInt(txf_cedula.getText()); // Convierte el texto a entero
        if (gestionClController.eliminarCliente(cedula)) { // Pasa el entero como argumento
            listClientes.remove(selectedCliente);
            limpiarCamposCliente();
            limpiarSeleccion();
        }
    }
    

    private void actualizarCliente() {

        if (selectedCliente != null && gestionClController.actualizarCliente(selectedCliente.getCedula(), buildCliente())) {
            int index = listClientes.indexOf(selectedCliente);
            if (index >= 0) {
                listClientes.set(index, buildCliente());
            }
            tb_listClientes.refresh();
            limpiarSeleccion();
            limpiarCamposCliente();
        }
    }

    private void limpiarSeleccion() {
        tb_listClientes.getSelectionModel().clearSelection();
        limpiarCamposCliente();
    }

    private void limpiarCamposCliente() {
        txf_cedula.clear();
        txf_nombre.clear();
        txf_telefono.clear();
        txf_correo.clear();
    }

}