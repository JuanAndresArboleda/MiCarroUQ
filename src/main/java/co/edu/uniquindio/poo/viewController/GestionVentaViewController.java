package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionVentaController;
import co.edu.uniquindio.poo.model.EstadoVenta;
import co.edu.uniquindio.poo.model.Venta;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class GestionVentaViewController {

    @FXML
    private TableColumn<Venta, String> tbc_cliente;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<Venta, String> tbc_matricula;

    @FXML
    private TableView<Venta> tb_listSolicitudes;

    @FXML
    private Button btn_aceptar;

    @FXML
    private TableColumn<Venta, String> tbc_nombre;

    @FXML
    private TableColumn<Venta, String> tbc_estado;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_negar;

    @FXML
    private TableColumn<Venta, String> tbc_cedula;

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarVenta();
    }

    @FXML
    void onAceptar(ActionEvent event) {
        aceptarVenta();
    }

    @FXML
    void onNegar(ActionEvent event) {
        negarVenta();
    }

    GestionVentaController gestionVentaController;
    ObservableList<Venta> listVentas = FXCollections.observableArrayList();
    Venta selectedVenta;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        gestionVentaController = new GestionVentaController(app.consesionario);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerVentas();

        // Agregar los elementos a la tabla
        tb_listSolicitudes.setItems(listVentas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_nombre.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCliente().getNombre())));
        tbc_cedula.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCliente().getId())));
        tbc_matricula.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getVehiculo().getMatricula())));
        tbc_estado.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getEstadoVenta().toString()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerVentas() {
        listVentas.addAll(gestionVentaController.obtenerListaVentas());
    }

    private void listenerSelection() {
        tb_listSolicitudes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVenta = newSelection;
        });
    }

    private void negarVenta() {
        selectedVenta.setestadoVenta(EstadoVenta.NEGADA);
    }

    private void aceptarVenta() {
        selectedVenta.setestadoVenta(EstadoVenta.ACEPTADA);
        listVentas.add(selectedVenta);
        tb_listSolicitudes.refresh();
    }

    private void eliminarVenta() {
        if (selectedVenta.getEstadoVenta().equals(EstadoVenta.ACEPTADA)
                || selectedVenta.getEstadoVenta().equals(EstadoVenta.NEGADA)) {
            listVentas.remove(selectedVenta);
        }
    }
}
