package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FruitController {

    

    @FXML
    Button btn1, btn2,btn3,btn4,btn5;

    Beatriz beatriz = new Beatriz();
    Christine christine = new Christine();
    Jasper jasper = new Jasper();
    Arjay arjay = new Arjay();
    Justin justin = new Justin();


    public void initialize() {

        beatriz.setName("Beatriz Asuncion");
        beatriz.setage("19");

        christine.setName("Christine Lu");
        christine.setage("19");
        
        jasper.setName("Jasper Deguito");
        jasper.setage("19");

        arjay.setName("Arjay balboa");
        arjay.setage("20");

        justin.setName("Justin Canedo");
        justin.setage("19");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hi my name is " + christine.getName() + " and my age is  " + christine.getage() + " yrs old");
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hi my name is " + beatriz.getName() + " and my age is  " + beatriz.getage() + "yrs old");
        }
        if (sourceButton.equals(btn3)) {
            alert.setContentText("Hi my name is " + jasper.getName() + " and my age is  " + jasper.getage() + " yrs old");
        }

        if (sourceButton == btn4) {
            alert.setContentText("Hi my name is " + arjay.getName() + " and my age is  " + arjay.getage() + " yrs old");
        }
        if (sourceButton == btn5) {
            alert.setContentText("Hi my name is " + justin.getName() + " and my age is  " + justin.getage() + " yrs old");
        }


        alert.showAndWait();

    }
}
