import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  //Declarations of instance variables
  ArrayList<Actor> actors;

  public Stage() {
    //Instantiate stuff here! :)
    actors = new ArrayList<>();
    grid = new Grid();
    actors.add(new Cat(grid.cellAtColRow(1, 1)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));
  }

  public void addActor(Actor actor) {
    actors.add(actor);
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for (Actor a : actors) 
    {
        a.paint(g);
    }
  }
}

