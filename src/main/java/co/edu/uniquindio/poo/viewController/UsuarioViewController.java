package co.edu.uniquindio.poo.viewController;

import java.util.ResourceBundle;
import javafx.scene.text.Text;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;

public class UsuarioViewController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button btn_cliente;

  @FXML
  private Text lbl_bienvenido;

  @FXML
  private AnchorPane ap_usuario;

  @FXML
  private Text lbl_iniciarComo;

  @FXML
  private Button btn_administrador;


  @FXML
  void onAdministrador(ActionEvent event) {
    app.openAdministrador();
  }

  @FXML
  void onCliente(ActionEvent event) {
    app.openCliente();
  }

  App app;

  public void setApp(App app) {
    this.app = app;
  }

  @FXML
  void initialize() {
  }
}
