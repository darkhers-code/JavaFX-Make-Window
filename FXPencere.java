package com.example.javafxprojects;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
public class FXPencere extends Application{
    public void start(Stage pStage){
        pStage.setTitle("Yeni Pencere");
        Label l = new Label("JavaFX");
        Scene s = new Scene(l, 400, 200);
        pStage.setScene(s);
        pStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
