import java.awt.*;
import javax.swing.*;

public class Box extends JPanel{
    static int x, y, width, height;

    public Box(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public static void draw(Graphics g){
        g.drawRect(x, y, width, height);
    }
    
}
