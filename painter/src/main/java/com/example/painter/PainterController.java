package com.example.painter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML private Button clearButton;
    @FXML private Pane drawingAreaPane;
    @FXML private RadioButton eraserButton;
    @FXML private RadioButton penButton;
    @FXML private ToggleGroup toolsToggleGroup;

    private Paint brushColor = Color.BLACK;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (drawingAreaPane.getBoundsInParent().contains(event.getX(), event.getY())) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, brushColor);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }

    @FXML
    void toolsButtonSelected(ActionEvent event) {
        brushColor = (Color) toolsToggleGroup.getSelectedToggle().getUserData();
    }

    public void initialize () {
        penButton.setUserData(Color.BLACK);
        eraserButton.setUserData(Color.WHITE);
    }
}



