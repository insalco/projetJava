package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.DataPeople;

import java.io.IOException;

/**
 * Code en reference au controller gerant la page 2 du projet.
 * Dans ce code nous reprenons les variables initialisées dans la classe du controller 1
 * dans le but de les affichers
 * De nouvelles variables sous formes de texte sont créer toujours à l'aide de scene builder.
 * Une option supplémentaire est de gerer un champs de mot de passe afin d'acceder à la suite du projet
 * sinon le projet reste sur la deuxieme page.
 * Le mot de passe pour acceder à la seconde page est "POOPROJECT"
 * Par ailleurs, les nouvelles données son gerée grâce à la classe Specifics.
 */

public class ControllerPage2 {

    private DataPeople myData;
    private Specifics details;

    @FXML
    private Label lblPrenom;

    @FXML
    private Label lblPlaceBirth;
    @FXML
    private Label monAge;

    @FXML
    private Label lblSex;

    @FXML
    private Label lblNationality;

    @FXML
    private Label lblName;

    @FXML
    private Label lblName1;

    @FXML
    private Label lblPrenom1;

    @FXML
    private TextField Illness;

    @FXML
    private TextArea Drugs;

    @FXML
    private TextField Days;

    @FXML
    private PasswordField password;
    @FXML
    private Label message;


    @FXML
    void stop1(ActionEvent event) {
        System.exit(0);

    }


    @FXML
    void Print(ActionEvent event) throws IOException {
        System.out.println("Print test unitaire");
        // mot de passe est : POOPROJECT
        if( password.getText().equals("POOPROJECT")) {
            message.setText("bon");

            // Code permettant la gestion de la fenetre
            details = new Specifics(Illness.getText(), Drugs.getText(), Days.getText());
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Page3.fxml"));
            AnchorPane root = fxmlLoader.load();
            ControllerPage3 MyController = fxmlLoader.getController();    // Mettre le controller de page2.fxml
            //MyController.transfertData(myData1);	// Méthode (a mettre dans le controller) permettant le passage d'un paramètre au controller de la page2.fxml
            MyController.transfertData(myData, details);    // Méthode (a mettre dans le controller) permettant le passage d'un paramètre au controller de la page2.fxml
            Stage nextPage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            //page2.setTitle("Projet Test");	// Pas obligatoire
            nextPage.setScene(new Scene(root));
            nextPage.show();
        }
        else {
            message.setText("Your password hasn't been confirmed");
            message.setTextFill(Color.rgb(210, 39, 30));


        }

    }



    public void transfertData(DataPeople myData) {    // méthode permettant de récupérer des données de la page précédente
        this.myData = myData;

        lblPrenom.setText(myData.getNom());
        lblName.setText(myData.getPrenom());
        lblPlaceBirth.setText(myData.getPlace());
        monAge.setText(myData.getAnnees());
        lblSex.setText(myData.getSex());
        lblNationality.setText(myData.getNationality());
        lblName1.setText(myData.getPrenom());
        lblPrenom1.setText(myData.getNom());

    }

}





