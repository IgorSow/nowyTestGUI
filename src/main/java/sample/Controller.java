package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import logika.LogikaGry;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    Button BUTTON1 = null;

    @FXML
    Button BUTTONrun;

    @FXML
    Label LABBEL1;

    @FXML
    Pane PAIN1;

    @FXML

    public void initialize(URL location, ResourceBundle resources) {


        logika.Button button = new logika.Button(BUTTON1, 1, 1);

        button.onClick((x,y)->{
            
        });


        LogikaGry logikaGry = new LogikaGry();

        PAIN1.getChildren().removeAll(BUTTON1);

        BUTTONrun.setOnAction(event -> {

            PAIN1.getChildren().add(BUTTON1);
            LABBEL1.setText(logikaGry.wolajTaMetode());
        });
        BUTTON1.setOnAction((event) -> {
            PAIN1.getChildren().removeAll(BUTTONrun);
            LABBEL1.setText("aaaa");

        });
//
//        BUTTON1.setOnAction();

    }


}
