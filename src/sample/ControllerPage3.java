package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import sample.DataPeople;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static javafx.application.Application.launch;

public class ControllerPage3 {
    private DataPeople myData;
    private Specifics details;

    @FXML
    private Label lblName2;

    @FXML
    private Label lblPrenom2;

    @FXML
    private Label lblmaladie;

    @FXML
    private Label lblDrugs;

    @FXML
    private Label lblDays;


    @FXML
    void stop2(ActionEvent event) {
        System.exit(0);

    }




    public void transfertData(DataPeople myData2,Specifics details){
        this.myData= myData2;
        this.details= details;

        lblName2.setText(myData.getNom());
        lblPrenom2.setText(myData.getPrenom());
        lblmaladie.setText(details.getMaladie());
        lblDrugs.setText(details.getMedicaments());
        lblDays.setText(details.getTraitement());
    }
}
