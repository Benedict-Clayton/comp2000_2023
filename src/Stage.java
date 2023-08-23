import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();

  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }

    Optional<Cell> underTheMouse = grid.cellAtPoint(mouseLoc);

    if(underTheMouse.isPresent()){
      Cell hoveringCell = underTheMouse.get();
      g.setColor(Color.BLUE);
      g.drawString(String.valueOf(hoveringCell.col) + String.valueOf(hoveringCell.row), x:740, y:30);
    }
  }
}
