package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionVhController;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.PickUpElectrico;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class GestionVhViewController {
    @FXML
    private TableColumn<Vehiculo, String> tbc_cilindraje;

    @FXML
    private TableColumn<Vehiculo, String> tbc_capacidadCarga;

    @FXML
    private TableColumn<Vehiculo, String> tbc_capacidadBateria;

    @FXML
    private TableColumn<Vehiculo, String> tbc_estado;

    @FXML
    private TableColumn<Vehiculo, String> tbc_velocidadMax;

    @FXML
    private TableColumn<Vehiculo, String> tbc_numeroPasajeros;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Vehiculo, String> tbc_autonomia;

    @FXML
    private TableColumn<Vehiculo, String> tbc_tiempoCarga;

    @FXML
    private TableColumn<Vehiculo, String> tbc_cambios;

    @FXML
    private TableColumn<Vehiculo, String> tbc_transmision;

    @FXML
    private TableColumn<Vehiculo, String> tbc_tipoVehiculo;
    @FXML
    private TextField txf_estado;
    @FXML
    private Button btn_actualizarVehiculo;
    @FXML
    private TextField txf_marca;
    @FXML
    private TableColumn<Vehiculo, Boolean> tbc_disponible;
    @FXML
    private TableView<Vehiculo> tb_listVehiculos;
    @FXML
    private TextField txf_matricula;
    @FXML
    private Text txt_gestionVh;
    @FXML
    private TableColumn<Vehiculo, String> tbc_matricula;
    @FXML
    private TextField txf_modelo;
    @FXML
    private TableColumn<Vehiculo, String> tbc_modelo;
    @FXML
    private ScrollPane ap_gestionVh;
    @FXML
    private TableColumn<Vehiculo, String> tbc_marca;
    @FXML
    private TextField txf_cambios;
    @FXML
    private ImageView img_carro;
    @FXML
    private Button btn_volver;
    @FXML
    private Button btn_eliminar;
    @FXML
    private TextField txf_velocidadMaxima;
    @FXML
    private ComboBox<String> cbox_tipoVehiculo;
    @FXML
    private Button btn_agregaVehiculo;
    @FXML
    private TextField txf_cilindraje;
    @FXML
    private TextField txf_transmision;
    @FXML
    private VBox additionalFields;

    @FXML
    private TextField numeroPuertasField, numeroPasajerosField, capacidadCargaField, tiempodeCargaField,
            autonomiaCargaCompletaField;
    @FXML
    private CheckBox aireAcondicionadoCheckBox, AbsCheckBox, camaraReversaCheckBox, bolsasAireCheckBox, cuatroxcuatroCheckBox;

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    GestionVhController gestionVhController;
    ObservableList<Vehiculo> listVehiculos = FXCollections.observableArrayList();
    Vehiculo selectedVehiculo;

    @SuppressWarnings("static-access")
    @FXML
    public void initialize() {
        gestionVhController = new GestionVhController(app.consesionario);

        // Opciones del ComboBox "Tipo Vehículo"
        cbox_tipoVehiculo.getItems().addAll(
                "PickUp Electrico",
                "Camión Electrico",
                "Camioneta Electrica",
                "Van Electrica",
                "Moto Electrica",
                "Bus Electrico",
                "Deportivo Electrico",
                "Sedan Electrico",
                "PickUp Hibrido",
                "Camión Hibrido",
                "Camioneta Hibrida",
                "Van Hibrida",
                "Moto Hibrida",
                "Bus Hibrido",
                "Deportivo Hibrido",
                "Sedan Hibrido",
                "PickUp a Combustible",
                "Camión a Combustible",
                "Camioneta a Combustible",
                "Van a Combustible",
                "Moto a Combustible",
                "Bus a Combustible",
                "Deportivo a Combustible",
                "Sedan a Combustible");

        // Valor por defecto
        cbox_tipoVehiculo.setValue("Tipo De Vehiculo");

        // Actualizar campos adicionales según el tipo de vehículo seleccionado
        cbox_tipoVehiculo.setOnAction(event -> actualizarCamposAdicionales());

        initView();
    }

    private void initView() {
        // Traer los datos del vehículo a la tabla
        initDataBinding();

        // Obtiene la lista de vehículos
        obtenerVehiculos();

        // Agregar los elementos a la tabla
        //tb_listVehiculos.setItems(listVehiculos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        // Configurar las columnas
        tbc_marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbc_modelo.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getModelo())));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tbc_estado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado().toString()));
        tbc_cambios.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCambios())));
        tbc_velocidadMax.setCellValueFactory(cellData -> new SimpleStringProperty(String.format("%.2f", cellData.getValue().getVelocidadmaxima())));
        tbc_cilindraje.setCellValueFactory(cellData -> new SimpleStringProperty(String.format("%.2f", cellData.getValue().getCilindraje())));
        tbc_transmision.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTransmision().toString()));
    }

    private void obtenerVehiculos() {
        listVehiculos.addAll(gestionVhController.obtenerListaVehiculos());
    }

    private void listenerSelection() {
        tb_listVehiculos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
            mostrarInformacionVehiculo(selectedVehiculo);
        });
    }

    private void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            txf_marca.setText(vehiculo.getMarca());
            txf_modelo.setText(Integer.toString(vehiculo.getModelo()));
            txf_matricula.setText(vehiculo.getMatricula());
            txf_estado.setText(vehiculo.getEstado().toString()); // Suponiendo que Estado tiene un método toString que lo convierte a String
            txf_velocidadMaxima.setText(String.format("%.2f", vehiculo.getVelocidadmaxima()));
            txf_cilindraje.setText(String.format("%.2f", vehiculo.getCilindraje()));
            txf_transmision.setText(vehiculo.getTransmision().toString()); // Suponiendo que Transmision tiene un método toString
        }
    }

    private void crearVehiculo() {
        try {
            String marca = txf_marca.getText();
            int modelo = Integer.parseInt(txf_modelo.getText());
            Estado estado = Estado.valueOf(txf_estado.getText().toUpperCase());
            int cambios = Integer.parseInt(txf_cambios.getText());
            double velocidadmaxima = Double.parseDouble(txf_velocidadMaxima.getText());
            double cilindraje = Double.parseDouble(txf_cilindraje.getText());
            Transmision transmision = Transmision.valueOf(txf_transmision.getText().toUpperCase());
            String matricula = txf_matricula.getText();

            String tipoSeleccionado = cbox_tipoVehiculo.getValue();
            Vehiculo vehiculo = null;

            if (tipoSeleccionado.equals("PickUp Electrico")) {
                int capacidadCarga = Integer.parseInt(capacidadCargaField.getText());
                boolean aireAcondicionado = aireAcondicionadoCheckBox.isSelected();
                boolean abs = AbsCheckBox.isSelected();
                int numeroPasajeros = Integer.parseInt(numeroPasajerosField.getText());
                int numeroPuertas = Integer.parseInt(numeroPuertasField.getText());
                boolean camaraReversa = camaraReversaCheckBox.isSelected();
                boolean bolsasAire = bolsasAireCheckBox.isSelected();
                boolean cuatroxcuatro = cuatroxcuatroCheckBox.isSelected();
                int autonomiaCargaCompleta = Integer.parseInt(autonomiaCargaCompletaField.getText());
                String tiempoDeCarga = tiempodeCargaField.getText();

                vehiculo = new PickUpElectrico(marca, estado, modelo, cambios, velocidadmaxima, cilindraje,
                        transmision, matricula, autonomiaCargaCompleta, tiempoDeCarga, String.valueOf(capacidadCarga),
                        aireAcondicionado, abs, numeroPasajeros, numeroPuertas, camaraReversa, bolsasAire,
                        cuatroxcuatro);
            }

            gestionVhController.crearVehiculo(vehiculo);
            obtenerVehiculos(); // Para refrescar la tabla
        } catch (Exception e) {
            System.out.println("Error al crear el vehículo: " + e.getMessage());
        }
    }

    private void actualizarCamposAdicionales() {
        String tipoSeleccionado = cbox_tipoVehiculo.getValue();

        // Mostrar/ocultar campos dependiendo del tipo de vehículo
        additionalFields.setVisible(tipoSeleccionado.contains("Electrico") || tipoSeleccionado.contains("Hibrido"));
    }

    @FXML
    public void agregarVehiculo() {
        crearVehiculo();
    }

    @FXML
    public void eliminarVehiculo() {
        if (selectedVehiculo != null) {
            gestionVhController.eliminarVehiculo(selectedVehiculo.getMatricula());
            obtenerVehiculos();
        }
    }

    @FXML
    public void actualizarVehiculo() {
        if (selectedVehiculo != null) {
            crearVehiculo(); // Para actualizar los valores
            obtenerVehiculos();
        }
    }

}
