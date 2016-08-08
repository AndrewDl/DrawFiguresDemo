package sample;

import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public Canvas canvas;
    GraphicsContext g = null;

    Rectangle rectangle = new Rectangle(50,50,200,200);

    Timer t = new Timer(200, e -> {
        System.out.println("Tick-tack");
        drawRectangle(rectangle);
        rectangle.setLocation(rectangle.x+10,rectangle.y+10);
    });
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("test");
        t.start();
    }

    public void drawRectangle(Rectangle rectangle){
        g = canvas.getGraphicsContext2D();
        g.clearRect(0,0,canvas.getWidth(),canvas.getHeight());

        g.setLineWidth(10);
        g.setStroke(Color.BLUE);
        g.setFill(Color.RED);
        g.strokeRect(rectangle.getX(),rectangle.getY(),rectangle.getWidth(),rectangle.getHeight());
    }
}
