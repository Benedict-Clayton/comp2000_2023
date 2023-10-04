import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Horse extends Actor {
  private Motif horse;

  public Horse(Cell inLoc, boolean isHuman) {
    super(inLoc, Color.RED, isHuman, 4);
    horse = new Motif("assets/Chess_tile_nl.png");
  }

  protected void setPoly() {
  }

  public void paint(){
    Float phase = 0.5f;
    horse.draw(g, labelIndent, yLoc, Color.getHSBColor(phase, 0.5f, 1.0f));
  }


}


// Horse - Adapter
// Actor - Target
// Motif - Adaptee
