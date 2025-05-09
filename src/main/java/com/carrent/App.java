package com.carrent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/carrent/CarRental.fxml"));
        primaryStage.setTitle("Car Rental System");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/com/carrent/icons/car_rental_logo.jpeg")));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}