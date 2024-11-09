package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ReservasController;
import co.edu.uniquindio.poo.model.Reserva;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class ReservasViewController {

    ReservasController reservasController;
    static ObservableList<Reserva> listReservas = FXCollections.observableArrayList();
    Reserva selectedReserva;

    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private TableColumn<Reserva, String> tbc_id;

    @FXML
    private TableColumn<Reserva, String> tbc_tiempo;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private TableView<Reserva> tb_listReservas;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_cancelarAlquiler;

    @FXML
    private Text txt_bienvenido;

    @FXML
    private TableColumn<Reserva, String> tbc_matricula;

    @FXML
    private Button btn_alquilarVh;

    @FXML
    private AnchorPane anp_reservas;

    @FXML
    private Text txt_nombreCliente;

    @FXML
    private Text txt_quedeseahacer;

    @FXML
    private Text txt_reservas;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private Text txt_tucarro;

    @FXML
    void onCancelarAlq(ActionEvent event) {
        cancelarAlquiler();
    }

    @FXML
    void onAlquilar(ActionEvent event) {
        app.openMenuVh();
    }

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuario();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        reservasController = new ReservasController(app.empresa);
        initView();
    }

    private void initView() {

        // Traer los datos de la Reserva a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerReservas();

        // Agregar los elementos a la tabla
        tb_listReservas.setItems(listReservas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_id.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo()));
        tbc_tiempo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTiempoReserva()));
        // tbc_tipo.setCellValueFactory(cellData -> new
        // SimpleStringProperty(cellData.getValue().get()));

        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerReservas() {
        if (listReservas.isEmpty()) {
            Reserva reserva = new Reserva("HDP47", "7 horas", "Fernely", "8192");
            listReservas.add(reserva);
            Reserva reserva2 = new Reserva("FHT29", "3 dias", "Andres", "1827");
            listReservas.add(reserva2);
        }
    }

    private void listenerSelection() {
        tb_listReservas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedReserva = newSelection;
        });
    }

    private void cancelarAlquiler() {
        listReservas.remove(selectedReserva);
    }
}
