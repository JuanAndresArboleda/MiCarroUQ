package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.GestionVhController;
import co.edu.uniquindio.poo.model.CamionElectrico;
import co.edu.uniquindio.poo.model.CamionetaElectrica;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.MotoElectrica;
import co.edu.uniquindio.poo.model.PickUpElectrico;
import co.edu.uniquindio.poo.model.SedanCombustible;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Uso;
import co.edu.uniquindio.poo.model.VanElectrica;
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
    private TableColumn<Vehiculo, String> tbc_estado;

    @FXML
    private TableColumn<Vehiculo, String> tbc_velocidadMax;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Vehiculo, String> tbc_cambios;

    @FXML
    private TableColumn<Vehiculo, String> tbc_transmision;

    @FXML
    private TableColumn<Vehiculo, String> tbc_tipoVehiculo;
    @FXML
    private ComboBox<Estado> txf_estado;
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
    private ComboBox<Transmision> txf_transmision;

    @FXML
    void onVolver(ActionEvent event) {
        app.volver();
    }

    @FXML
    void onAgregarVehiculo(ActionEvent event) {
        agregarVehiculo();
    }

    @FXML
    void onEliminarVehiculo(ActionEvent event) {
        eliminarVehiculo();
    }

    @FXML
    void onActualizarVehiculo(ActionEvent event) {
        actualizarVehiculo();
    }

    @FXML
    private ComboBox<Uso> txf_uso;

    @FXML
    private VBox PickupField1;
    @FXML
    private VBox PickupField2;
    @FXML
    private VBox PickupField3;
    @FXML
    private VBox PickupField4;
    @FXML
    private VBox PickupField5;
    @FXML
    private VBox PickupField6;
    @FXML
    private VBox PickupField7;
    @FXML
    private VBox PickupField8;
    @FXML
    private VBox PickupField9;
    @FXML
    private VBox PickupField10;
    @FXML
    private VBox PickupField11;
    @FXML
    private VBox PickupField12;
    @FXML
    private TextField numeroPuertasField, numeroPasajerosField, capacidadCargaField, tiempodeCargaField,
            autonomiaCargaCompletaField, numeroEjesField, tipoCamionField;
    @FXML
    private CheckBox aireAcondicionadoCheckBox, AbsCheckBox, camaraReversaCheckBox, bolsasAireCheckBox,
            cuatroxcuatroCheckBox, frenosAireCheckBox;

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

        txf_uso.getItems().addAll(
                Uso.PRIVADO,
                Uso.PROFESIONAL);

        txf_transmision.getItems().addAll(
                Transmision.AUTOMATICA,
                Transmision.MANUAL);

        txf_estado.getItems().addAll(
                Estado.NUEVO,
                Estado.USADO);

        cbox_tipoVehiculo.getItems().addAll(
                "PickUp Electrico",
                "Camion Electrico",
                "Camioneta Electrica",
                "Van Electrica",
                "Moto Electrica",
                "Bus Electrico",
                "Deportivo Electrico",
                "Sedan Electrico",
                "PickUp Hibrido",
                "Camion Hibrido",
                "Camioneta Hibrida",
                "Van Hibrida",
                "Moto Hibrida",
                "Bus Hibrido",
                "Deportivo Hibrido",
                "Sedan Hibrido",
                "PickUp a Combustible",
                "Camion a Combustible",
                "Camioneta a Combustible",
                "Van a Combustible",
                "Moto a Combustible",
                "Bus a Combustible",
                "Deportivo a Combustible",
                "Sedan a Combustible");

        cbox_tipoVehiculo.setValue("Tipo De Vehiculo");

        // Establecer los textos de sugerencia
        txf_estado.setPromptText("Estado");
        txf_transmision.setPromptText("Transmision");

        // Actualizar campos adicionales según el tipo de vehículo seleccionado
        cbox_tipoVehiculo.setOnAction(event -> actualizarCamposAdicionales());

        initView();
    }

    private void actualizarCamposAdicionales() {
        String tipoSeleccionado = cbox_tipoVehiculo.getValue();
        boolean esPickUpElectrico = "PickUp Electrico".equals(tipoSeleccionado);
        boolean esCamionElectrico = "Camion Electrico".equals(tipoSeleccionado);
        boolean esCamionetaElectrica = "Camioneta Electrica".equals(tipoSeleccionado);
        boolean esVanElectrica = "Van Electrica".equals(tipoSeleccionado);
        boolean esMotoElectrica = "Moto Electrica".equals(tipoSeleccionado);
        boolean esBusElectrico = "Bus Electrico".equals(tipoSeleccionado);
        boolean esDeportivoElectrico = "Deportivo Electrico".equals(tipoSeleccionado);
        boolean esSedanElectrico = "Sedan Electrico".equals(tipoSeleccionado);
        boolean esPickUpHibrido = "PickUp Hibrido".equals(tipoSeleccionado);
        boolean esCamionHibrido = "Camion Hibrido".equals(tipoSeleccionado);
        boolean esCamionetaHibrido = "Camioneta Hibrida".equals(tipoSeleccionado);
        boolean esVanHibrido = "Van Hibrida".equals(tipoSeleccionado);
        boolean esMotoHibrido = "Moto Hibrida".equals(tipoSeleccionado);
        boolean esBusHibrido = "Bus Hibrido".equals(tipoSeleccionado);
        boolean esDeportivoHibrido = "Deportivo Hibrido".equals(tipoSeleccionado);
        boolean esSedanHibrido = "Sedan Hibrido".equals(tipoSeleccionado);
        boolean esPickUpaCombustible = "PickUp a Combustible".equals(tipoSeleccionado);
        boolean esCamionaCombustible = "Camion a Combustible".equals(tipoSeleccionado);
        boolean esCamionetaaCombustible = "Camioneta a Combustible".equals(tipoSeleccionado);
        boolean esVanaCombustible = "Van a Combustible".equals(tipoSeleccionado);
        boolean esMotoaCombustible = "Moto a Combustible".equals(tipoSeleccionado);
        boolean esBusaCombustible = "Bus a Combustible".equals(tipoSeleccionado);
        boolean esDeportivoaCombustible = "Deportivo a Combustible".equals(tipoSeleccionado);
        boolean esSedanaCombustible = "Sedan a Combustible".equals(tipoSeleccionado);
        PickupField1.setVisible(esPickUpElectrico);
        PickupField2.setVisible(esPickUpElectrico);
        PickupField3.setVisible(esPickUpElectrico);
        PickupField4.setVisible(esPickUpElectrico);
        PickupField5.setVisible(esPickUpElectrico || esCamionElectrico);
        PickupField6.setVisible(esPickUpElectrico);
        PickupField7.setVisible(esPickUpElectrico);
        PickupField8.setVisible(esPickUpElectrico || esCamionElectrico);
        PickupField9.setVisible(esCamionElectrico);
        PickupField10.setVisible(esCamionElectrico);
        PickupField11.setVisible(esCamionElectrico);
        PickupField12.setVisible(esCamionElectrico);
    }

    private void initView() {
        // Traer los datos del vehículo a la tabla
        initDataBinding();

        // Obtiene la lista de vehículos
        obtenerVehiculos();

        // Agregar los elementos a la tabla
        tb_listVehiculos.setItems(listVehiculos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        // Configurar las columnas
        tbc_marca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbc_modelo.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getModelo())));
        tbc_matricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tbc_estado
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado().toString()));
        tbc_cambios.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCambios())));
        tbc_velocidadMax.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.format("%.2f", cellData.getValue().getVelocidadmaxima())));
        tbc_cilindraje.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.format("%.2f", cellData.getValue().getCilindraje())));
        tbc_transmision.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getTransmision().toString()));
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
            txf_estado.setValue(vehiculo.getEstado());
            txf_velocidadMaxima.setText(String.format("%.2f", vehiculo.getVelocidadmaxima()));
            txf_cilindraje.setText(String.format("%.2f", vehiculo.getCilindraje()));
            txf_transmision.setValue(vehiculo.getTransmision());

            txf_cambios.setText(Integer.toString(vehiculo.getCambios()));
        }
    }

    private void crearVehiculo() {
        try {
            String marca = txf_marca.getText();
            int modelo = Integer.parseInt(txf_modelo.getText());
            Estado estado = Estado.valueOf(txf_estado.getPromptText().toUpperCase());
            int cambios = Integer.parseInt(txf_cambios.getText());
            double velocidadmaxima = Double.parseDouble(txf_velocidadMaxima.getText());
            double cilindraje = Double.parseDouble(txf_cilindraje.getText());
            Transmision transmision = Transmision.valueOf(txf_transmision.getPromptText().toUpperCase());
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

            }else if (tipoSeleccionado.equals("Camion Electrico")) {
                String capacidadCarga = capacidadCargaField.getText();
                boolean aireAcondicionado = aireAcondicionadoCheckBox.isSelected();
                boolean abs = AbsCheckBox.isSelected();
                boolean frenosAire = frenosAireCheckBox.isSelected();
                String numeroEjes = numeroEjesField.getText();    
                String tipoCamion = tipoCamionField.getText();
                Uso uso = Uso.valueOf(txf_uso.getPromptText().toUpperCase());
                int autonomiacargacompleta= Integer.parseInt(autonomiaCargaCompletaField.getText());
                String tiempodecarga = tiempodeCargaField.getText();

                vehiculo = new CamionElectrico(marca, estado, modelo, cambios, velocidadmaxima, cilindraje,
                    transmision, matricula, autonomiacargacompleta,tiempodecarga, capacidadCarga, aireAcondicionado, abs, frenosAire, numeroEjes, tipoCamion, uso);
                    
            } else if (tipoSeleccionado.equals("Camioneta Electrica")){
                /**
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

                vehiculo = new CamionetaElectrica(marca, estado, modelo, cambios, velocidadmaxima, cilindraje,
                transmision, matricula, autonomiaCargaCompleta, tiempoDeCarga, velocidadCrucero, capacidadCarga, aireAcondicionado, abs, 
                numeroPasajeros, numeroPuertas, camaraReversa, bolsasAire, cuatroxcuatro);
                */
            } else if (tipoSeleccionado.equals("Van Electrica")) {

            }else if(tipoSeleccionado.equals("Bus Electrica")){

            }else if(tipoSeleccionado.equals("Deportivo Electrico")){

            }else if(tipoSeleccionado.equals("Sedan Electrico")){

            }else if(tipoSeleccionado.equals("PickUp Hibrido")){

            }else if(tipoSeleccionado.equals("Camion Hibrido")){

            }else if(tipoSeleccionado.equals("Camioneta Hibrida")){

             }else if(tipoSeleccionado.equals("Van Hibrida"))
             {

             }else if(tipoSeleccionado.equals("Moto Hibrida"))
             {

             }else if(tipoSeleccionado.equals("Bus Hibrido"))
             {

             }else if(tipoSeleccionado.equals("Deportivo Hibrido"))
             {

             }else if(tipoSeleccionado.equals("Sedan Hibrido"))
             {

             }else if(tipoSeleccionado.equals("PickUp a Combustible"))
             {

             }else if(tipoSeleccionado.equals("Camion a Combustible"))
             {

             }else if(tipoSeleccionado.equals("Camioneta a Combustible"))
             {

             }else if(tipoSeleccionado.equals("Van a Combustible"))
             {

             }else if(tipoSeleccionado.equals("Moto a Combustible"))
             {

             }else if(tipoSeleccionado.equals("Bus a Combustible"))
             {

             }else if(tipoSeleccionado.equals("Deportivo a Combustible"))
             {

             }else if (tipoSeleccionado.equals("Sedan Combustible")) {
                         
    }


    gestionVhController.crearVehiculo(vehiculo);

    obtenerVehiculos(); // Para refrescar la tabla
    }catch(

    Exception e)
    {
        System.out.println("Error al crear el vehículo: " + e.getMessage());
    }
    }

    private void agregarVehiculo() {
        crearVehiculo();
    }

    private void eliminarVehiculo() {
        if (selectedVehiculo != null) {
            gestionVhController.eliminarVehiculo(selectedVehiculo.getMatricula());
            obtenerVehiculos();
        }
    }

    private void actualizarVehiculo() {
        if (selectedVehiculo != null) {
            crearVehiculo(); // Para actualizar los valores
            obtenerVehiculos();
        }
    }

}
