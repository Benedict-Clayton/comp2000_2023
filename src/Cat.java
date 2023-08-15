import java.awt.Color;

public class Cat extends Actor {
  public Cat(Cell inLoc) {
    loc = inLoc;
    color = Color.BLUE;
  }
}


/* 
~~~~~
    Polygon ear1 = new Polygon();
    ear1.addPoint(loc.x + 11, loc.y + 5);
    ear1.addPoint(loc.x + 15, loc.y + 15);
    ear1.addPoint(loc.x + 7, loc.y + 15);
    Polygon ear2 = new Polygon();
    ear2.addPoint(loc.x + 22, loc.y + 5);
    ear2.addPoint(loc.x + 26, loc.y + 15);
    ear2.addPoint(loc.x + 18, loc.y + 15);
    Polygon face = new Polygon();
    face.addPoint(loc.x + 5, loc.y + 15);
    face.addPoint(loc.x + 29, loc.y + 15);
    face.addPoint(loc.x + 17, loc.y + 30);
~~~~~
*/











/*
 public class Cat extends Actor {
    public Cat() {
        initPolygons();
    }

    @Override
    public void initPolygons() {
        polygons.clear(); // Clear any existing polygons
        // Define the polygons that make up the Cat actor
        // Example: create a triangle for the cat's head
        int[] xPoints = { 0, 10, 20 };
        int[] yPoints = { 20, 0, 20 };
        polygons.add(new Polygon(xPoints, yPoints, 3));
    }

    @Override
    protected Color getFillColor() {
        return Color.BLUE; // Fill color for the Cat actor
    }
}

 */