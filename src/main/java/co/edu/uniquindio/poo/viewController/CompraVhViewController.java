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

public class CompraVhViewController {

    @FXML
    private TableColumn<?, ?> tbc_cliente;

    @FXML
    private Button btn_comprar;

    @FXML
    private ImageView img_carro;

    @FXML
    private AnchorPane ap_gestionCliente;

    @FXML
    private TableColumn<?, ?> tbc_estado1;

    @FXML
    private TableColumn<?, ?> tbc_vehiculo;

    @FXML
    private TableView<?> tb_listSolicitudes1;

    @FXML
    private TableColumn<?, ?> tbc_matricula1;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private TableColumn<?, ?> tbc_nombre;

    @FXML
    private TableColumn<?, ?> tbc_estado;

    @FXML
    private TableColumn<?, ?> tbc_tipo;

    @FXML
    private TableColumn<?, ?> tbc_modelo;

    @FXML
    private Button btn_volder;

    @FXML
    private TableView<?> tb_listVhVenta;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<?, ?> tbc_cedula;

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    @FXML
    void onComprar(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
