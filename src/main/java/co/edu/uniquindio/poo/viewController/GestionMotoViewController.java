package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionMotoController;
import javafx.beans.property.SimpleObjectProperty;
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
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Caja;

public class GestionMotoViewController {

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
    private Text txt_caja;

    @FXML
    private AnchorPane ap_gestionVehiculo;

    @FXML
    private TableView<Moto> tb_listMotos;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<Moto, String> tbc_disponible;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Moto, String> tbc_caja;

    @FXML
    private Button btn_agregaVehiculo;

    @FXML
    private Text txt_matricula;

    @FXML
    private TextField txf_matricula;

    @FXML
    private Text txt_gestionVh;

    @FXML
    private TableColumn<Moto, String> tbc_matricula;

    @FXML
    private TextField txf_modelo;

    @FXML
    private Text txt_añoFabricacion;

    @FXML
    private TableColumn<Moto, String> tbc_añoFabricacion;

    @FXML
    private TableColumn<Moto, String> tbc_tipo;

    @FXML
    private TextField txf_añoFabricacion;

    @FXML
    private TableColumn<Moto, String> tbc_modelo;

    @FXML
    private TextField txf_caja;

    @FXML
    private TableColumn<Moto, String> tbc_marca;

    @FXML
    void onVolver(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onActualizar(ActionEvent event) {
        //actualizarMoto();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        //agregarMoto();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        //eliminarMoto();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    GestionMotoController gestionMotoController;
    ObservableList<Moto> listMotos = FXCollections.observableArrayList();
    Moto selectedMoto;

    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        gestionMotoController = new GestionMotoController(app.empresa);
        initView();
    }

    
    private void initView() {
        // Traer los datos de la moto a la tabla
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
        //tbc_caja.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCaja()));
        tbc_disponible.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDisponible()));

        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerMotos() {
        listMotos.addAll(gestionMotoController.obtenerListaMotos());
    }

    private void listenerSelection() {
        tb_listMotos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedMoto = newSelection;
            mostrarInformacionMoto(selectedMoto);
        });
    }

    private void mostrarInformacionMoto(Moto moto) {
        if (moto != null) {
            txf_modelo.setText(moto.getModelo());
            txf_marca.setText(moto.getMarca());
            txf_matricula.setText(moto.getMatricula());
            txf_añoFabricacion.setText(moto.getAñoFabricacion());
            //txf_caja.setText(moto.getCaja());
        }
    }

    /*
    private void agregarMoto() {
        Moto moto = buildMoto();
        if (gestionMotoController.crearMoto(moto)) {
            listMotos.add(moto);
            limpiarCamposMoto();
        }
    }*/

    /*
    private Moto buildMoto() {
        Moto moto = new Moto(txf_marca.getText(), txf_matricula.getText(), txf_modelo.getText(), txf_añoFabricacion.getText(), txf_añoFabricacion.getText(), txf_modelo.getText());
        return moto;
    }*/

    /*
    private void eliminarMoto() {
        if (gestionMotoController.eliminarMoto(txf_matricula.getText())) {
            listMotos.remove(selectedMoto);
            limpiarCamposMoto();
            limpiarSeleccion();
        }
    }

    private void actualizarMoto() {

        if (selectedMoto != null && gestionMotoController.actualizarMoto(selectedMoto.getMatricula(), buildMoto())) {
            int index = listMotos.indexOf(selectedMoto);
            if (index >= 0) {
                listMotos.set(index, buildMoto());
            }
            tb_listMotos.refresh();
            limpiarSeleccion();
            limpiarCamposMoto();
        }
    }

    private void limpiarSeleccion() {
        tb_listMotos.getSelectionModel().clearSelection();
        limpiarCamposMoto();
    }

    private void limpiarCamposMoto() {
        txf_marca.clear();
        txf_modelo.clear();
        txf_matricula.clear();
        txf_añoFabricacion.clear();
        txf_caja.clear();
    }
    */
}
