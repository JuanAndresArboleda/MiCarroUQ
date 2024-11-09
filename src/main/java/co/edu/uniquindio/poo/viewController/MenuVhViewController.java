package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class MenuVhViewController {

    @FXML
    private Button btn_auto;

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
        app.openReservas();
    }

    @FXML
    void onAuto(ActionEvent event) {
        app.openAlquilarAuto();
    }

    @FXML
    void onCamioneta(ActionEvent event) {
        app.openAlquilarCamioneta();
    }

    @FXML
    void onMoto(ActionEvent event) {
        app.openAlquilarMoto();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
