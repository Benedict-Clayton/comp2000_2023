import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  ArrayList<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();

    actors.add(new Cat(grid.cellAtColRow(1, 1)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));
  }

  public void addActor(Actor actor) {
    actors.add(actor);
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for (Actor actor : actors) 
    {
        actor.paint(g);
    }
  }
}

