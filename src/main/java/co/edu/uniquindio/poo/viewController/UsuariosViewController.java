package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class UsuariosViewController {

  @FXML
  private Button btn_cliente;

  @FXML
  private Text lbl_bienvenido;

  @FXML
  private AnchorPane ap_usuario;

  @FXML
  private Text lbl_iniciarComo;

  @FXML
  private Button btn_empleado;

  @FXML
  private Button btn_administrador;

  @FXML
  void onCliente(ActionEvent event) {
    app.openIniciarCliente();
  }

  @FXML
  void onEmpleado(ActionEvent event) {
    app.openIniciarEmpleado();
  }

  @FXML
  void onAdministrador(ActionEvent event) {
    app.openIniciarAdministrador();
  }

  App app;

  public void setApp(App app) {
    this.app = app;
  }

  @FXML
  void initialize() {
  }

}