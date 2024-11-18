package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class IniciarClienteViewController {

    @FXML
    private Text txt_cliente;

    @FXML
    private TextField txf_nombre;

    @FXML
    private TextField txf_cedula;

    @FXML
    private AnchorPane ap_cliente;

    @FXML
    private Button btn_volver;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_ingresar;

    @FXML
    void onIngresarCl(ActionEvent event) {
        app.openCliente();
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openUsuarios();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
