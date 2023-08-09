import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    Grid grid;
    Actor cat;
    Actor dog;
    Actor bird;
    
    public Stage(){
        grid = new Grid();
        cat = new cat(grid.cellAtColRow(0,0));
        dog = new dog(grid.cellAtColRow(1,5));
        bird = new bird(grid.cellAtColRow(8,6));
    }
}
