package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class ElectricosViewController {

    @FXML
    private Button btn_deportivo;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_volver;

    @FXML
    private Button btn_moto;

    @FXML
    private Button btn_van;

    @FXML
    private Button btn_camioneta;

    @FXML
    private Button btn_bus;

    @FXML
    private AnchorPane ap_menuVehiculo;

    @FXML
    private Button btn_sedan;

    @FXML
    private Button btn_camion;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_pickup;

    @FXML
    private Text txt_administrador;

    @FXML
    void onVolver(ActionEvent event) {

    }

    @FXML
    void onVan(ActionEvent event) {

    }

    @FXML
    void onSedan(ActionEvent event) {

    }

    @FXML
    void onDeportivo(ActionEvent event) {

    }

    @FXML
    void onCamion(ActionEvent event) {

    }

    @FXML
    void onBus(ActionEvent event) {

    }

    @FXML
    void onMoto(ActionEvent event) {

    }

    @FXML
    void onCamioneta(ActionEvent event) {

    }

    @FXML
    void onPickup(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
