import java.awt.Color;
import java.util.ArrayList;
import java.awt.Polygon;

public class Cat extends Actor {

  public Cat(Cell inLoc) {
    polygons = new ArrayList<>();
    loc = inLoc;
    color = Color.BLUE;

    //Instantiate the Polygons of how they look.
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

    //Add the polygons to the array list!
    polygons.add(ear1);
    polygons.add(ear2);
    polygons.add(face);
  }
}