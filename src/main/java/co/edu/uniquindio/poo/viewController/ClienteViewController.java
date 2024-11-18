package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class ClienteViewController {

    @FXML
    private AnchorPane ap_reservas;

    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private TableColumn<?, ?> tbc_tiempo;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private Button btn_registrarVh;

    @FXML
    private Button btn_comprarVh;

    @FXML
    private TableView<?> tb_listReservas;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_gestionVentas;

    @FXML
    private TableColumn<?, ?> tbc_vehiculo;

    @FXML
    private Button btn_cancelarAlquiler;

    @FXML
    private Text txt_quedeseahacer1;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private Button btn_alquilarVh;

    @FXML
    private Text txt_nombreCliente1;

    @FXML
    private Text txt_nombreCliente11;

    @FXML
    private Text txt_nombreCliente;

    @FXML
    private TableColumn<?, ?> tbc_tipo;

    @FXML
    private Text txt_quedeseahacer;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private TableColumn<?, ?> tbc_modelo;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_venderVh;

    @FXML
    private Text txt_reservas1;

    @FXML
    void onGestionVentas(ActionEvent event) {

    }

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuarios();
    }

    @FXML
    void onVenderVh(ActionEvent event) {

    }

    @FXML
    void onAlquilarVh(ActionEvent event) {

    }

    @FXML
    void onRegistrarVh(ActionEvent event) {

    }

    @FXML
    void onComprarVh(ActionEvent event) {

    }

    @FXML
    void onCancelarAlq(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
