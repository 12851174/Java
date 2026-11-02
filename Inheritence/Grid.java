import java.awt.*;
import javax.swing.*;

public class Grid extends JPanel{
    //int rows, columns;

    public Grid(int rows, int cols){
        int width = 1920/cols;
        int height = 1080/rows;
        Box[][] grid = new Box[rows][cols];
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
