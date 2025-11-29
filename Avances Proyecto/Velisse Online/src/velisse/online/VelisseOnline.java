package velisse.online;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VelisseOnline extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("=== INICIANDO JavaFX ===");
        
        try {
            System.out.println("Buscando login.fxml en paquete por defecto...");
            
            // PARA PAQUETE POR DEFECTO, usa esta ruta:
            Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
            // ↑↑↑ CON barra porque está en paquete por defecto ↑↑↑
            
            System.out.println("FXML cargado correctamente!");
            
            Scene scene = new Scene(root, 800, 600);
            primaryStage.setTitle("Velisse Online");
            primaryStage.setScene(scene);
            
            System.out.println("Mostrando ventana...");
            primaryStage.show();
            System.out.println("=== VENTANA ABIERTA ===");
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== MAIN METHOD EJECUTADO ===");
        launch(args);
    }
}