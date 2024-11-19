package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Consesionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class IniciarEmpleadoViewController {

    @FXML
    private TextField txf_nombre;

    @FXML
    private TextField txf_cedula;

    @FXML
    private AnchorPane ap_empleado;

    @FXML
    private Button btn_volver;

    @FXML
    private Text txt_iniciarSesion;

    @FXML
    private Button btn_ingresar;

    @FXML
    private Text txt_administrador;

    App app;
    Consesionario consesionario;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void onIngresar(ActionEvent event) {
        app.openEmpleado();
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openUsuarios();
    }

    public void verificarEmpleado() {
        String cedulaText = txf_cedula.getText().trim();
        String nombreIngresado = txf_nombre.getText().trim();

        int cedulaIngresada = Integer.parseInt(cedulaText);

        if (cedulaText.isEmpty() || nombreIngresado.isEmpty()) {
            mostrarAlerta("La datos no pueden estar vacios.");
            return;
        } else {
            for (Empleado empleado : consesionario.getEmpleados()) {
                if (cedulaIngresada == empleado.getId() && nombreIngresado.equals(empleado.getNombre())) {
                    app.openEmpleado();
                    break;
                } else {
                    mostrarAlerta("Cédula o nombre incorrectos.");
                    limpiarCampos();
                }
            }
        }
    }

    private void mostrarAlerta(String mensaje) {
        // Crear y mostrar una alerta de error o advertencia
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Advertencia");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    private void limpiarCampos() {
        txf_cedula.clear();
        txf_nombre.clear();
    }
}
