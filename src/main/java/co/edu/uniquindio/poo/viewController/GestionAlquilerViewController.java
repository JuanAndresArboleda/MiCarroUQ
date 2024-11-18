package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class GestionAlquilerViewController {

    @FXML
    private TableColumn<?, ?> tbc_cliente;

    @FXML
    private ImageView img_carro;

    @FXML
    private AnchorPane ap_gestionCliente;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private TableView<?> tb_listSolicitudes;

    @FXML
    private Button btn_aceptar;

    @FXML
    private TableColumn<?, ?> tbc_nombre;

    @FXML
    private TableColumn<?, ?> tbc_estado;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_negar;

    @FXML
    private TableColumn<?, ?> tbc_cedula;

    @FXML
    private TableColumn<?, ?> tbc_tiempoAlquiler;

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void onAceptar(ActionEvent event) {

    }

    @FXML
    void onNegar(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
