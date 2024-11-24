package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorUsingMouse extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Circle
        Circle circle = new Circle(100); // Radius = 100
        circle.setFill(Color.WHITE);     // Initial color
        circle.setStroke(Color.BLACK);  // Border color

        // Event handling: Change to black on mouse press
        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));

        // Event handling: Change to white on mouse release
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        // Set up the layout
        StackPane pane = new StackPane(circle);

        // Create the Scene
        Scene scene = new Scene(pane, 400, 400); // Window size: 400x400
        primaryStage.setTitle("Change Circle Color with Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}