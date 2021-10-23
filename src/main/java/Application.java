/*
 *  UCF COP3330 Fall 2021 Application Assignment 1
 *  Copyright 2021 Patrick Brookshire
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    //Startup for GUI.fxml
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));

            //Scene Loader
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("GUI");
            primaryStage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //main
    public static void main(String[] args) {
        launch();
    }

}
