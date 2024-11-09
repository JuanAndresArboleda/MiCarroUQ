package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionAutoController;
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
import co.edu.uniquindio.poo.model.Auto;

public class GestionAutoViewController {

    @FXML
    private TableColumn<Auto, String> tbc_puertas;

    @FXML
    private Text txt_marca;

    @FXML
    private Button btn_actualizarVehiculo;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_volver;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TextField txf_marca;

    @FXML
    private Text txt_modelo;

    @FXML
    private AnchorPane ap_gestionVehiculo;

    @FXML
    private TableView<Auto> tb_listAutos;

    @FXML
    private TextField txf_puertas;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<Auto, String> tbc_disponible;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_agregaVehiculo;

    @FXML
    private Text txt_puertas;

    @FXML
    private Text txt_matricula;

    @FXML
    private TextField txf_matricula;

    @FXML
    private Text txt_gestionVh;

    @FXML
    private TableColumn<Auto, String> tbc_matricula;

    @FXML
    private TextField txf_modelo;

    @FXML
    private Text txt_añoFabricacion;

    @FXML
    private TableColumn<Auto, String> tbc_añoFabricacion;

    @FXML
    private TextField txf_añoFabricacion;

    @FXML
    private TableColumn<Auto, String> tbc_modelo;

    @FXML
    private TableColumn<Auto, String> tbc_marca;

    @FXML
    void onVolver(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onActualizar(ActionEvent event) {
        actualizarAuto();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        agregarAuto();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarAuto();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    GestionAutoController gestionAutoController;
    ObservableList<Auto> listAutos = FXCollections.observableArrayList();
    Auto selectedAuto;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        gestionAutoController = new GestionAutoController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos del auto a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerAutos();

        // Agregar los elementos a la tabla
        tb_listAutos.setItems(listAutos);

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
        Auto auto2 = new Auto("Renault", "81826", "2018", "2017","si", "4");
        listAutos.add(auto2);
    }

    private void listenerSelection() {
        tb_listAutos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedAuto = newSelection;
            mostrarInformacionAuto(selectedAuto);
        });
    }

    private void mostrarInformacionAuto(Auto auto) {
        if (auto != null) {
            txf_modelo.setText(auto.getModelo());
            txf_marca.setText(auto.getMarca());
            txf_matricula.setText(auto.getMatricula());
            txf_añoFabricacion.setText(auto.getAñoFabricacion());
            txf_puertas.setText(auto.getCantidadPuertas());
        }
    }

    private void agregarAuto() {
        Auto auto = buildAuto();
        if (gestionAutoController.crearAuto(auto)) {
            listAutos.add(auto);
            limpiarCamposAuto();
        }
    }

    private Auto buildAuto() {
        Auto auto = new Auto(txf_marca.getText(), txf_matricula.getText(), txf_modelo.getText(),
                txf_añoFabricacion.getText(), txf_puertas.getText(), txf_puertas.getText());
        return auto;
    }

    private void eliminarAuto() {
        if (gestionAutoController.eliminarAuto(txf_matricula.getText())) {
            listAutos.remove(selectedAuto);
            limpiarCamposAuto();
            limpiarSeleccion();
        }
    }

    private void actualizarAuto() {

        if (selectedAuto != null && gestionAutoController.actualizarAuto(selectedAuto.getMatricula(), buildAuto())) {
            int index = listAutos.indexOf(selectedAuto);
            if (index >= 0) {
                listAutos.set(index, buildAuto());
            }
            tb_listAutos.refresh();
            limpiarSeleccion();
            limpiarCamposAuto();
        }
    }

    private void limpiarSeleccion() {
        tb_listAutos.getSelectionModel().clearSelection();
        limpiarCamposAuto();
    }

    private void limpiarCamposAuto() {
        txf_marca.clear();
        txf_modelo.clear();
        txf_matricula.clear();
        txf_añoFabricacion.clear();
        txf_puertas.clear();
    }
}
