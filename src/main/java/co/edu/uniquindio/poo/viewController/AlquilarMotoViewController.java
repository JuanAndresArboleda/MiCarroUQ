package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AlquilarMotoController;
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
import co.edu.uniquindio.poo.model.Caja;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Vehiculo;

public class AlquilarMotoViewController {

    AlquilarMotoController alquilarMotoController;
    ObservableList<Vehiculo> listMotos = FXCollections.observableArrayList();
    Moto selectedMoto;

    @FXML
    private SubScene ssc_fondo2;

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
    private TableColumn<Vehiculo, String> tbc_matricula;

    @FXML
    private Button btn_reservar;

    @FXML
    private Text txt_tiempoReserva;

    @FXML
    private Text txt_alquilarVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbc_añoFabricacion;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<Vehiculo, Boolean> tbc_disponible;

    @FXML
    private TableColumn<Vehiculo, String> tbc_modelo;

    @FXML
    private TableColumn<Vehiculo, String> tbc_marca;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Vehiculo, String> tbc_caja;

    @FXML
    private TableView<Vehiculo> tb_listMotos;

    @FXML
    void onVolver(ActionEvent event) {
        app.openMenuVh();
    }

    @FXML
    void onTiempo(ActionEvent event) {

    }

    @FXML
    void onReservar(ActionEvent event) {
        reservarMoto();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        alquilarMotoController = new AlquilarMotoController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos de la Moto a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerMotos();

        // Agregar los elementos a la tabla
        tb_listMotos.setItems(listMotos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_modelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbc_marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tbc_añoFabricacion
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAñoFabricacion()));
        //tbc_caja.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCaja()));

        // tbc_disponible.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().determinarDisponibilidad()));

        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerMotos() {
        Moto moto = new Moto("Kawasaki", "10223", "2015", "2010", "si", Caja.AUTOMATICA);
        listMotos.add(moto);
        Moto moto2 = new Moto("Viwis", "42341", "2013", "2009", "si", Caja.MANUAL);
        listMotos.add(moto2);
    }

    private void listenerSelection() {
        tb_listMotos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedMoto = (Moto) newSelection;
        });
    }

    private void reservarMoto() {
        if (!txf_tiempoReserva.getText().isEmpty()) {
            Reserva reserva = new Reserva(selectedMoto.getMatricula(), txf_tiempoReserva.getText(), "cliente1", "213");
            ReservasViewController.listReservas.add(reserva);
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        txf_tiempoReserva.clear();
        txf_detallesUso.clear();
    }

}
