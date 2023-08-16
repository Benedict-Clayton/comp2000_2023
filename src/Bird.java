import java.awt.Color;
import java.util.ArrayList;
import java.awt.Polygon;

public class Bird extends Actor {

  public Bird(Cell inLoc) {
    polygons = new ArrayList<>();
    loc = inLoc;
    color = Color.GREEN;

    //Instantiate the Polygons of how they look.
    Polygon wing1 = new Polygon();
    wing1.addPoint(loc.x + 5, loc.y + 5);
    wing1.addPoint(loc.x + 15, loc.y + 17);
    wing1.addPoint(loc.x + 5, loc.y + 17);
    Polygon wing2 = new Polygon();
    wing2.addPoint(loc.x + 30, loc.y + 5);
    wing2.addPoint(loc.x + 20, loc.y + 17);
    wing2.addPoint(loc.x + 30, loc.y + 17);
    Polygon body = new Polygon();
    body.addPoint(loc.x + 15, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 25);
    body.addPoint(loc.x + 15, loc.y + 25);

    //Add the polygons to the array list!
    polygons.add(wing1);
    polygons.add(wing2);
    polygons.add(body);
  }
}
