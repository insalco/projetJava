package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.DataPeople;

import java.io.IOException;
import java.util.Calendar;

/**
 * Ci-dessous, le controller gere la page 1 du projet.
 * Sont present des variables private de type String.
 * Differentes méthodes sont également présente: le calcul de l'age du patient en fonction de la date entré plus haut
 * grace a un data picker.
 * Une autre méthode afin de quitter le programme proprement.
 * Le dernier événement est de manipuler les variables acquise dans ce controlleur en utilisant
 * une autre classe(DataPeople).
 * Nous utilisons l'instance myData de la classe DataPeople.
 */

public class ControllerPage1 {


    private DataPeople myData;
    // On peut travailler avec une liste de DataPerson
    private ObservableList<DataPeople> listData= FXCollections.observableArrayList();

    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField PlaceOfBirth;

    @FXML
    private TextField Sex;

    @FXML
    private TextField Nationality;

    @FXML
    private DatePicker DateOfBirth;

    @FXML
    private TextField ages;


    @FXML
    void showAge(MouseEvent event) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int birthYear =  (DateOfBirth.getValue().getYear());
        int age = year - birthYear;
        ages.setText(Integer.toString(age)+ " Year");
        // test unitaire afin de voir si le calcul se fait bien dans la console
        //System.out.println(putDate);

    }
    private void showAge(){

    }


    @FXML
    void stop(ActionEvent event) {
    // quitter proprement le programme
        System.exit(0);
    }


    @FXML
    void NextPage(ActionEvent event) throws IOException {
        System.out.println("NextPAge test unitaire");

        myData = new DataPeople(FirstName.getText(), LastName.getText(),PlaceOfBirth.getText(),Sex.getText(),Nationality.getText(),ages.getText());	// On save nos data dans un objet


        // Code permettant la gestion des fenêtres
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Page2.fxml"));
        AnchorPane root= fxmlLoader.load();
        ControllerPage2 MyController = fxmlLoader.getController();	// Mettre le controller de page2.fxml
        MyController.transfertData(myData);	// Méthode (a mettre dans le controller) permettant le passage d'un paramètre au controller de la page2.fxml

        Stage nextPage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //page2.setTitle("Projet Test");	// Pas obligatoire
        nextPage.setScene(new Scene(root));
        nextPage.show();

    }

}



