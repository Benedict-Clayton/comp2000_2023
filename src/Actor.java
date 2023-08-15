import java.awt.Color;
import java.awt.Graphics;

public abstract class Actor {
  Color color;
  Cell loc;

  public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
  }
}













/*
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
    protected ArrayList<Polygon> polygons; // List of polygons representing the actor

    public Actor() {
        polygons = new ArrayList<Polygon>();
    }

    public abstract void initPolygons(); // Initialize polygons for the actor

    public void paint(Graphics g) {
        for (Polygon polygon : polygons) {
            g.setColor(Color.BLACK); // Set outline color
            g.drawPolygon(polygon); // Draw outline
            g.setColor(getFillColor()); // Set fill color
            g.fillPolygon(polygon); // Fill with color
        }
    }

    protected abstract Color getFillColor(); // Get fill color for the actor
}

 */