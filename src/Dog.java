import java.awt.Color;
import java.util.ArrayList;
import java.awt.Polygon;

public class Dog extends Actor {

  public Dog(Cell inLoc) {
    polygons = new ArrayList<>();
    loc = inLoc;
    color = Color.YELLOW;

    //Instantiate the Polygons of how they look.
    Polygon ear1 = new Polygon();
    ear1.addPoint(loc.x + 5, loc.y + 5);
    ear1.addPoint(loc.x + 15, loc.y + 5);
    ear1.addPoint(loc.x + 5, loc.y + 15);
    Polygon ear2 = new Polygon();
    ear2.addPoint(loc.x + 20, loc.y + 5);
    ear2.addPoint(loc.x + 30, loc.y + 5);
    ear2.addPoint(loc.x + 30, loc.y + 15);
    Polygon face = new Polygon();
    face.addPoint(loc.x + 8, loc.y + 7);
    face.addPoint(loc.x + 27, loc.y + 7);
    face.addPoint(loc.x + 27, loc.y + 25);
    face.addPoint(loc.x + 8, loc.y + 25);

    //Add the polygons to the array list!
    polygons.add(ear1);
    polygons.add(ear2);
    polygons.add(face);
  }
}