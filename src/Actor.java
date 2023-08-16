import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
  
  //Declarations of instance variables
  ArrayList<Polygon> polygons;
  Color color;
  Cell loc;
 
  public void paint(Graphics g) {

    for (Polygon p : polygons)
    {
      g.setColor(color);
      g.drawPolygon(p);
      g.setColor(Color.GRAY);
    }

  }
}