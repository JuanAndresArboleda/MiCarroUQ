package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.EmpresaController;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Reserva;

public class EmpresaViewController {

    EmpresaController empresaController;
    ObservableList<Reserva> listReservas = FXCollections.observableArrayList();

    @FXML
    private TableColumn<Reserva, String> tbc_id;

    @FXML
    private TableColumn<Reserva, String> tbc_cliente;

    @FXML
    private TableColumn<Reserva, String> tbc_tiempo;

    @FXML
    private Button btn_gestionVehiculos;

    @FXML
    private TableView<Reserva> tb_listReservas;

    @FXML
    private ImageView img_carro;

    @FXML
    private Text txt_queDeseaHacer;

    @FXML
    private Text txt_bienvenido;

    @FXML
    private TableColumn<Reserva, String> tbc_matricula;

    @FXML
    private TableColumn<Reserva, String> tbc_nombre;

    @FXML
    private Text txt_reservas;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private Text txt_nombreAdministrador;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_gestionClientes;

    @FXML
    private TableColumn<Empresa, String> tbc_cedula;

    @FXML
    void onGestionVh(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onGestionCl(ActionEvent event) {
        app.openGestionCl();
    }

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuario();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    
    @SuppressWarnings("static-access")
    @FXML
    void initialize() {
        empresaController = new EmpresaController(app.empresa);
        initView();
    }
    

    private void initView() {

        //actualizarNombre();
        // Traer los datos de la Reserva a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerReservas();

        // Agregar los elementos a la tabla
        tb_listReservas.setItems(listReservas);
    }

    private void initDataBinding() {
        tbc_id.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo()));
        tbc_tiempo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTiempoReserva()));

        // tbc_tipo.setCellValueFactory(cellData -> new
        // SimpleStringProperty(cellData.getValue().get()));

        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerReservas() {
        if (listReservas.isEmpty()) {
            Reserva reserva = new Reserva("HDP47", "7 horas", "Fernely", "8192");
            listReservas.add(reserva);
            Reserva reserva2 = new Reserva("FHT29", "3 dias", "Andres", "1827");
            listReservas.add(reserva2);
        }
    }

    private void actualizarNombre(AdministradorViewController administradorViewController) {
        String nombre = administradorViewController.obtenerNombre();
        txt_nombreAdministrador.setText(nombre);
    }
}
