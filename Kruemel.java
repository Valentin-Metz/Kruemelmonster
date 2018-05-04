import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.image.*;
import javafx.scene.paint.ImagePattern;
import javax.swing.BorderFactory;
//import java.awt.Color;

public class Kruemel
{
    private int x;
    private int y;
    private int radius;
    private int durchmesser;
    private String farbe;
    private Circle kreis;
    private Keks heimatKeks;

    public Kruemel(int x,int y,Keks hk)
    {
        this.x = x;
        this.y = y;
        hk = heimatKeks;
        radius=4;

        // Original Kekse hier:
        kreis=new Circle(x,y,radius);
        kreis.setFill(Color.BROWN);
        kreis.setStroke(Color.RED);
        kreis.setStrokeWidth(3);
        kreis.setOnMouseClicked(e -> 
            {
                kreis.setStroke(Color.BLUE);
                kreis.setCenterX(100);
            }
        );
    }

    public void setHeimatkeks(Keks k)
    {
        heimatKeks = k;
    }
    
    public Circle getKreis()
    {
        return kreis;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
            
}