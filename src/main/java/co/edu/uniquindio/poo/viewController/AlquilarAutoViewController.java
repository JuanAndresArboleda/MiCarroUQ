package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AlquilarAutoController;
import co.edu.uniquindio.poo.model.Auto;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class AlquilarAutoViewController {

    AlquilarAutoController alquilarAutoController;
    ObservableList<Auto> listAutos = FXCollections.observableArrayList();
    Auto selectedAuto;

    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private TableColumn<Auto, String> tbc_puertas;

    @FXML
    private TextArea txf_detallesUso;

    @FXML
    private TextField txf_tiempoReserva;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private Text txt_detallesUso;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_volver;

    @FXML
    private TableColumn<Auto, String> tbc_matricula;

    @FXML
    private Button btn_reservar;

    @FXML
    private TableView<Auto> tbl_listAutos;

    @FXML
    private Text txt_tiempoReserva;

    @FXML
    private Text txt_alquilarVehiculo;

    @FXML
    private TableColumn<Auto, String> tbc_añoFabricacion;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<Auto, String> tbc_disponible;

    @FXML
    private TableColumn<Auto, String> tbc_modelo;

    @FXML
    private TableColumn<Auto, String> tbc_marca;

    @FXML
    private Text txt_tucarro;

    @FXML
    void onVolver(ActionEvent event) {
        app.openMenuVh();
    }

    @FXML
    void onReservar(ActionEvent event) {
        reservarAuto();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        alquilarAutoController = new AlquilarAutoController(app.empresa);
        initView();
    }
    

    private void initView() {
        // Traer los datos del Auto a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerAutos();

        // Agregar los elementos a la tabla
        tbl_listAutos.setItems(listAutos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_modelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbc_marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tbc_añoFabricacion
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAñoFabricacion()));
        tbc_puertas.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCantidadPuertas()));
        tbc_disponible.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDisponible()));

        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerAutos() {
        Auto auto = new Auto("Toyota", "19827", "2016", "2012","si", "4");
        listAutos.add(auto);
        Auto auto2 = new Auto("Renault", "81826", "2018", "2017", "si", "4");
        listAutos.add(auto2);
    }

    private void listenerSelection() {
        tbl_listAutos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedAuto = newSelection;
        });
    }

    private void reservarAuto() {
        if (!txf_tiempoReserva.getText().isEmpty()) { 
            Reserva reserva = new Reserva(selectedAuto.getMatricula(), txf_tiempoReserva.getText(), "cliente1", "213");
            ReservasViewController.listReservas.add(reserva);
            limpiarCampos();
        }
    }
    

    private void limpiarCampos() {
        txf_tiempoReserva.clear();
        txf_detallesUso.clear();
    }

}