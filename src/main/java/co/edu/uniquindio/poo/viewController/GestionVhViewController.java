package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class GestionVhViewController {

    @FXML
    private Button btn_auto;

    @FXML
    private AnchorPane ap_menuVehiculo;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_volver;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_moto;

    @FXML
    private Text txt_administrador;

    @FXML
    private Button btn_camioneta;

    @FXML
    void onVolver(ActionEvent event) {
        app.openEmpresa();
    }

    @FXML
    void onAuto(ActionEvent event) {
        app.openGestionAuto();
    }

    @FXML
    void onCamioneta(ActionEvent event) {
        app.openGestionCamioneta();
    }

    @FXML
    void onMoto(ActionEvent event) {
        app.openGestionMoto();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
