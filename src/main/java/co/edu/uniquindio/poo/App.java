package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Stack;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Consesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.viewController.GestionAlquilerViewController;
import co.edu.uniquindio.poo.viewController.ClienteViewController;
import co.edu.uniquindio.poo.viewController.EmpleadoViewController;
import co.edu.uniquindio.poo.viewController.IniciarEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.IniciarClienteViewController;
import co.edu.uniquindio.poo.viewController.IniciarAdministradorViewController;
import co.edu.uniquindio.poo.viewController.AdministradorViewController;
import co.edu.uniquindio.poo.viewController.GestionClViewController;
import co.edu.uniquindio.poo.viewController.GestionVentaViewController;
import co.edu.uniquindio.poo.viewController.UsuariosViewController;
import co.edu.uniquindio.poo.viewController.CompraVhViewController;
import co.edu.uniquindio.poo.viewController.GestionVhViewController;
import co.edu.uniquindio.poo.viewController.GestionEmpViewController;

public class App extends Application {

    private Stage primaryStage;
    @SuppressWarnings("exports")
    public static Consesionario consesionario = new Consesionario("MiCarroUQ", 123);

    private Stack<Scene> sceneHistory = new Stack<>();

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MiCarroUQ");
        openUsuarios();
    }

    public static void main(String[] args) {
        launch();
    }

    public void openUsuarios() {
        inicializarData();
        try {
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(App.class.getResource("usuarios.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader1.load(); // Cambiado de VBox a AnchorPane
            UsuariosViewController usuariosViewController = loader1.getController();
            usuariosViewController.setApp(this);

            Scene scene1 = new Scene(rootLayout);
            primaryStage.setScene(scene1);
            primaryStage.show();

        } catch (IOException e) {
            System.err.println("Error al cargar usuarios.fxml");
            e.printStackTrace();
        }
    }

    public void openAdministrador() {

        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("administrador.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            AdministradorViewController administradorViewController = loader2.getController();
            administradorViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void volver() {
        if (!sceneHistory.isEmpty()) {
            Scene previousScene = sceneHistory.pop();
            primaryStage.setScene(previousScene);
            primaryStage.show();
        }
    }

    public void openCliente() {
        try {
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(App.class.getResource("cliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader3.load();
            ClienteViewController clienteViewController = loader3.getController();
            clienteViewController.setApp(this);

            Scene scene3 = new Scene(rootLayout);
            primaryStage.setScene(scene3);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openIniciarCliente() {
        try {
            FXMLLoader loader4 = new FXMLLoader();
            loader4.setLocation(App.class.getResource("iniciarCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader4.load();
            IniciarClienteViewController iniciarClienteViewController = loader4.getController();
            iniciarClienteViewController.setApp(this);

            Scene scene4 = new Scene(rootLayout);
            primaryStage.setScene(scene4);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openIniciarEmpleado() {
        try {
            FXMLLoader loader5 = new FXMLLoader();
            loader5.setLocation(App.class.getResource("iniciarEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader5.load();
            IniciarEmpleadoViewController iniciarEmpleadoViewController = loader5.getController();
            iniciarEmpleadoViewController.setApp(this);

            Scene scene5 = new Scene(rootLayout);
            primaryStage.setScene(scene5);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openIniciarAdministrador() {
        try {
            FXMLLoader loader6 = new FXMLLoader();
            loader6.setLocation(App.class.getResource("iniciarAdministrador.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader6.load();
            IniciarAdministradorViewController iniciarAdministradorViewController = loader6.getController();
            iniciarAdministradorViewController.setApp(this);

            Scene scene6 = new Scene(rootLayout);
            primaryStage.setScene(scene6);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openEmpleado() {
        try {
            FXMLLoader loader7 = new FXMLLoader();
            loader7.setLocation(App.class.getResource("empleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader7.load();
            EmpleadoViewController empleadoViewController = loader7.getController();
            empleadoViewController.setApp(this);

            Scene scene7 = new Scene(rootLayout);
            primaryStage.setScene(scene7);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionAlquiler() {
        sceneHistory.push(primaryStage.getScene());

        try {
            FXMLLoader loader8 = new FXMLLoader();
            loader8.setLocation(App.class.getResource("gestionAlquiler.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader8.load();
            GestionAlquilerViewController gestionAlquilerViewController = loader8.getController();
            gestionAlquilerViewController.setApp(this);

            Scene scene8 = new Scene(rootLayout);
            primaryStage.setScene(scene8);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionVenta() {
        sceneHistory.push(primaryStage.getScene());

        try {
            FXMLLoader loader9 = new FXMLLoader();
            loader9.setLocation(App.class.getResource("gestionVenta.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader9.load();
            GestionVentaViewController gestionVentaViewController = loader9.getController();
            gestionVentaViewController.setApp(this);

            Scene scene9 = new Scene(rootLayout);
            primaryStage.setScene(scene9);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCompraVh() {
        sceneHistory.push(primaryStage.getScene());

        try {
            FXMLLoader loader10 = new FXMLLoader();
            loader10.setLocation(App.class.getResource("compraVehiculo.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader10.load();
            CompraVhViewController compraVhViewController = loader10.getController();
            compraVhViewController.setApp(this);

            Scene scene10 = new Scene(rootLayout);
            primaryStage.setScene(scene10);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionCl() {
        sceneHistory.push(primaryStage.getScene());

        try {
            FXMLLoader loader11 = new FXMLLoader();
            loader11.setLocation(App.class.getResource("gestionCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader11.load();
            GestionClViewController gestionClViewController = loader11.getController();
            gestionClViewController.setApp(this);

            Scene scene11 = new Scene(rootLayout);
            primaryStage.setScene(scene11);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionVh() {
        sceneHistory.push(primaryStage.getScene());

        try {
            FXMLLoader loader12 = new FXMLLoader();
            loader12.setLocation(App.class.getResource("gestionVh.fxml"));
            ScrollPane rootLayout = (ScrollPane) loader12.load();
            GestionVhViewController gestionVhViewController = loader12.getController();
            gestionVhViewController.setApp(this);

            Scene scene12 = new Scene(rootLayout);
            primaryStage.setScene(scene12);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionEmp() {

        try {
            FXMLLoader loader13 = new FXMLLoader();
            loader13.setLocation(App.class.getResource("gestionEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader13.load();
            GestionEmpViewController gestionEmpViewController = loader13.getController();
            gestionEmpViewController.setApp(this);

            Scene scene13 = new Scene(rootLayout);
            primaryStage.setScene(scene13);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // servicios

    public void inicializarData() {

        Cliente cliente1 = new Cliente("Juan", 12345, 32022, "juan@gmail.com");
        consesionario.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("Nasly", 12346, 32023, "nasly@gmail.com");
        consesionario.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Pedro", 12347, 32024, "pedro@gmail.com");
        consesionario.agregarCliente(cliente3);

        Empleado empleado1 = new Empleado("Javier", 12348, 31128, "javier@gmail.com");
        consesionario.agregarEmpleado(empleado1);
        Empleado empleado2 = new Empleado("Joshep", 12349, 33020, "joshep@gmail.com");
        consesionario.agregarEmpleado(empleado2);
        Empleado empleado3 = new Empleado("Jonathan", 12310, 34192, "jonathan@gmail.com");
        consesionario.agregarEmpleado(empleado3);
    }

}
