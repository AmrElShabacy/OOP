package com.example.circle;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;


public class BindedCircle extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(100);
        circle.setStroke(Color.GREEN);
        circle.setFill(Color.PINK);

        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 100, 100);

        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));
//      circle.radiusProperty().bind(Bindings.min(scene.widthProperty(),
//                        scene.heightProperty())
//                .divide(2));

        stage.setTitle("A Centered Circle");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.sizeToScene();
        stage.show();
    }
}