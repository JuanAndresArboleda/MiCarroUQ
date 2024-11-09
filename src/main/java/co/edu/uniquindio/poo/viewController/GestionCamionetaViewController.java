package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionCamionetaController;
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
import co.edu.uniquindio.poo.model.Camioneta;

public class GestionCamionetaViewController {

    @FXML
    private Text txt_carga;

    @FXML
    private Text txt_marca;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_actualizarVehiculo;

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
    private TableView<Camioneta> tb_listCamionetas;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<Camioneta, String> tbc_disponible;

    @FXML
    private TextField txf_carga;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_agregaVehiculo;

    @FXML
    private TableColumn<Camioneta, String> tbc_carga;

    @FXML
    private Text txt_matricula;

    @FXML
    private TextField txf_matricula;

    @FXML
    private Text txt_gestionVh;

    @FXML
    private TableColumn<Camioneta, String> tbc_matricula;

    @FXML
    private TextField txf_modelo;

    @FXML
    private Text txt_añoFabricacion;

    @FXML
    private TableColumn<Camioneta, String> tbc_añoFabricacion;

    @FXML
    private TextField txf_añoFabricacion;

    @FXML
    private TableColumn<Camioneta, String> tbc_modelo;

    @FXML
    private TableColumn<Camioneta, String> tbc_marca;

    @FXML
    void onVolver(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onActualizar(ActionEvent event) {
        actualizarCamioneta();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        agregarCamioneta();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarCamioneta();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    
    GestionCamionetaController gestionCamionetaController;
    ObservableList<Camioneta> listCamionetas = FXCollections.observableArrayList();
    Camioneta selectedCamioneta;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        gestionCamionetaController = new GestionCamionetaController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos de la camioneta a la tabla
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
        listCamionetas.addAll(gestionCamionetaController.obtenerListaCamionetas());
    }

    private void listenerSelection() {
        tb_listCamionetas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCamioneta = newSelection;
            mostrarInformacionCamioneta(selectedCamioneta);
        });
    }

    private void mostrarInformacionCamioneta(Camioneta camioneta) {
        if (camioneta != null) {
            txf_modelo.setText(camioneta.getModelo());
            txf_marca.setText(camioneta.getMarca());
            txf_matricula.setText(camioneta.getMatricula());
            txf_añoFabricacion.setText(camioneta.getAñoFabricacion());
            txf_carga.setText(camioneta.getCapacidadCarga());
        }
    }

    private void agregarCamioneta() {
        Camioneta camioneta = buildCamioneta();
        if (gestionCamionetaController.crearCamioneta(camioneta)) {
            listCamionetas.add(camioneta);
            limpiarCamposCamioneta();
        }
    }

    private Camioneta buildCamioneta() {
        Camioneta camioneta = new Camioneta(txf_marca.getText(), txf_matricula.getText(), txf_modelo.getText(),
                txf_añoFabricacion.getText(),txf_carga.getText(), txf_carga.getText());
        return camioneta;
    }

    private void eliminarCamioneta() {
        if (gestionCamionetaController.eliminarCamioneta(txf_matricula.getText())) {
            listCamionetas.remove(selectedCamioneta);
            limpiarCamposCamioneta();
            limpiarSeleccion();
        }
    }

    private void actualizarCamioneta() {

        if (selectedCamioneta != null && gestionCamionetaController.actualizarCamioneta(selectedCamioneta.getMatricula(), buildCamioneta())) {
            int index = listCamionetas.indexOf(selectedCamioneta);
            if (index >= 0) {
                listCamionetas.set(index, buildCamioneta());
            }
            tb_listCamionetas.refresh();
            limpiarSeleccion();
            limpiarCamposCamioneta();
        }
    }

    private void limpiarSeleccion() {
        tb_listCamionetas.getSelectionModel().clearSelection();
        limpiarCamposCamioneta();
    }

    private void limpiarCamposCamioneta() {
        txf_marca.clear();
        txf_modelo.clear();
        txf_matricula.clear();
        txf_añoFabricacion.clear();
        txf_carga.clear();
    }

}
