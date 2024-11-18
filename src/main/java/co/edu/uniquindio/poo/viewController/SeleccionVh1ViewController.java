package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class SeleccionVh1ViewController {

    @FXML
    private AnchorPane ap_menuVehiculo;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_combustible;

    @FXML
    private Button btn_electrico;

    @FXML
    private Button btn_volver;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_hibrido;

    @FXML
    private Text txt_administrador;

    @FXML
    void onVolver(ActionEvent event) {

    }

    @FXML
    void onHibrido(ActionEvent event) {

    }

    @FXML
    void onCombustible(ActionEvent event) {

    }

    @FXML
    void onElectrico(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
