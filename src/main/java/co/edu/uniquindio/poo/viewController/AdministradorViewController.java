package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AdministradorViewController {

    @SuppressWarnings("exports")
    @FXML
    public TextField txf_nombreAd;

    @FXML
    private Button btn_volver;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_ingresar;

    @FXML
    private TextField txf_contraseña;

    @FXML
    private Text txt_administrador;

    @FXML
    void onIngresar(ActionEvent event) {
        app.openEmpresa();
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openUsuario();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    public String obtenerNombre() {
        return txf_nombreAd.getText();
    }
}
