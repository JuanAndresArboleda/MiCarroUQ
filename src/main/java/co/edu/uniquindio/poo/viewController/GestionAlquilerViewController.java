package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import co.edu.uniquindio.poo.controller.GestionAlqController;
import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.EstadoAlq;
import co.edu.uniquindio.poo.model.Vehiculo;

public class GestionAlquilerViewController {

    @FXML
    private TableColumn<Alquiler, String> tbc_cliente;

    @FXML
    private ImageView img_carro;

    @FXML
    private AnchorPane ap_gestionCliente;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<Alquiler, String> tbc_matricula;

    @FXML
    private TableView<Alquiler> tb_listSolicitudes;

    @FXML
    private Button btn_aceptar;

    @FXML
    private TableColumn<Alquiler, String> tbc_nombre;

    @FXML
    private TableColumn<Alquiler, String> tbc_estado;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_negar;

    @FXML
    private TableColumn<Alquiler, String> tbc_cedula;

    @FXML
    private TableColumn<Alquiler, String> tbc_tiempoAlquiler;

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        //eliminarAlquiler();
    }

    @FXML
    void onAceptar(ActionEvent event) {
        //aceptarAlquiler();
    }

    @FXML
    void onNegar(ActionEvent event) {
        //negarAlquiler();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    GestionAlqController gestionAlqController;
    ObservableList<Alquiler> listAlquileres = FXCollections.observableArrayList();
    Alquiler selectedAlquiler;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        gestionAlqController = new GestionAlqController(app.consesionario);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerAlquileres();

        // Agregar los elementos a la tabla
        tb_listSolicitudes.setItems(listAlquileres);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));
        tbc_cedula.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCliente().getId())));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getMatricula()));
        tbc_tiempoAlquiler.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getTiempoAlquiler())));
        tbc_estado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstadoAlq().toString()));
    }


    private void obtenerAlquileres() {
        listAlquileres.addAll(gestionAlqController.obtenerListaAlquileres());
    }

    private void listenerSelection() {
        tb_listSolicitudes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedAlquiler = newSelection;
        });
    }
    

    private void aceptarAlquiler() {
        Alquiler alquiler = selectedAlquiler;
        if (gestionAlqController.crearAlquiler(alquiler)) {
            listAlquileres.add(alquiler);  //hay que añadir el alquiler a la lista de alquileres del cliente y tambien a la lista general de alquileres en administrador y cambiar el estado a ACEPTADO
            selectedAlquiler.setEstadoAlq(EstadoAlq.APROBADO);
        }
    }

    private void eliminarAlquiler() {   //hay que eliminar el alquiler de la lista de solicitudes de alquiler, SOLO SI ESTADO = NEGADO O ACEPTADO
        Alquiler alquiler = selectedAlquiler;
        String codigo = alquiler.getCodigo();
        if (gestionAlqController.eliminarAlquiler(codigo) && (alquiler.getEstadoAlq().equals(EstadoAlq.APROBADO) || alquiler.getEstadoAlq().equals(EstadoAlq.NEGADO))) {
            listAlquileres.remove(alquiler);
        }
    }


    private void negarAlquiler() {   //el alquiler no se envia a ninguna parte pero su Estado cambia a NEGADO
        Alquiler alquiler = selectedAlquiler;
        String codigo = alquiler.getCodigo();
        if (gestionAlqController.eliminarAlquiler(codigo)) { // Pasa el entero como argumento
            listAlquileres.remove(alquiler);
            alquiler.setEstadoAlq(EstadoAlq.NEGADO);
        }
    }
}
