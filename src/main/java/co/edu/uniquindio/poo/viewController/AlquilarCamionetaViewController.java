package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AlquilarCamionetaController;
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
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Reserva;

public class AlquilarCamionetaViewController {

    AlquilarCamionetaController alquilarCamionetaController;
    ObservableList<Camioneta> listCamionetas = FXCollections.observableArrayList();
    Camioneta selectedCamioneta;

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
    private TableColumn<Camioneta, String> tbc_matricula;

    @FXML
    private Button btn_reservar;

    @FXML
    private TableView<Camioneta> tb_listCamionetas;

    @FXML
    private Text txt_tiempoReserva;

    @FXML
    private Text txt_alquilarVehiculo;

    @FXML
    private TableColumn<Camioneta, String> tbc_añoFabricacion;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<Camioneta, String> tbc_disponible;

    @FXML
    private TableColumn<Camioneta, String> tbc_modelo;

    @FXML
    private TableColumn<Camioneta, String> tbc_marca;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Camioneta, String> tbc_carga;

    @FXML
    void onVolver(ActionEvent event) {
        app.openMenuVh();
    }

    @FXML
    void onReservar(ActionEvent event) {
        reservarCamioneta();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    
    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        alquilarCamionetaController = new AlquilarCamionetaController(app.empresa);
        initView();
    }
    

    private void initView() {

        // Traer los datos de la Camioneta a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerCamionetas();

        // Agregar los elementos a la tabla
        tb_listCamionetas.setItems(listCamionetas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbc_modelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbc_marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tbc_añoFabricacion
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAñoFabricacion()));
        tbc_carga.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCapacidadCarga()));
        tbc_disponible.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDisponible()));

        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerCamionetas() {
        Camioneta camioneta = new Camioneta("Toyota", "74821", "2015", "2010","si", "15");
        listCamionetas.add(camioneta);
        Camioneta camioneta2 = new Camioneta("Toyota", "01482", "2021", "2015","si", "20");
        listCamionetas.add(camioneta2);
    }

    private void listenerSelection() {
        tb_listCamionetas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCamioneta = newSelection;
        });
    }

    private void reservarCamioneta() {
        if (!txf_tiempoReserva.getText().isEmpty()) { 
            Reserva reserva = new Reserva(selectedCamioneta.getMatricula(), txf_tiempoReserva.getText(), "cliente1", "213");
            ReservasViewController.listReservas.add(reserva);
            limpiarCampos();
        }
    }
    

    private void limpiarCampos() {
        txf_tiempoReserva.clear();
        txf_detallesUso.clear();
    }

}
