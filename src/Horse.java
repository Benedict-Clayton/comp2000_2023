import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Actor {
  public Motif horse;

  public Horse(Cell inLoc, boolean isHuman) {
    initActor(inLoc, Color.RED, isHuman, 4);
    horse = new Motif("assets/Chess_tile_nl.png");
  }

  protected void setPoly() {
  }

  public void paint(Graphics g){
    Float phase = 0.5f;
    horse.draw(g, getLocation().x, getLocation().y, Color.getHSBColor(phase, 0.5f, 1.0f));
  }


}


// Horse - Adapter
// Actor - Target
// Motif - Adaptee
