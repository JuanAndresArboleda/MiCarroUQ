package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class EmpleadoViewController {

    @FXML
    private AnchorPane ap_reservas;

    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private Button btn_gestionAlquiler;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private Button btn_registrarVh;

    @FXML
    private Button btn_comprarVh;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_gestionVentas;

    @FXML
    private Button btn_registrarCl;

    @FXML
    private Text txt_quedeseahacer1;

    @FXML
    private Text txt_nombreCliente1;

    @FXML
    private Text txt_nombreCliente11;

    @FXML
    private Text txt_nombreCliente;

    @FXML
    private Text txt_quedeseahacer;

    @FXML
    private Text txt_reservas;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableView<?> tb_listTransacciones;

    @FXML
    void onGestionVentas(ActionEvent event) {
        app.openGestionVenta();
    }

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuarios();
    }

    @FXML
    void onAlquilar(ActionEvent event) {
        app.openGestionAlquiler();
    }

    @FXML
    void onRegistrarVh(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onRegistrarCl(ActionEvent event) {
        app.openGestionCl();
    }

    @FXML
    void onComprarVh(ActionEvent event) {
        app.openCompraVh();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}