package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Nous retouvons ici notre premiere classe qui est la classe principale du projet
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Page1.fxml"));

        primaryStage.setTitle(""); // nom de la fenetre
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}









