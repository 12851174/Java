import java.awt.*;
import javax.swing.*;

public class Grid extends JPanel{
    int rows, columns, width, height;
    Box[][] grid;

    public Grid(int rows, int cols){
        width = 500/rows;
        height = 500/cols;
        grid = new Box[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                grid[i][j] = new Box(i * width, j * height, width, height);
            }
        }
    }

    public void paintComponent(Graphics g){
        for(Box[] arr : grid){
            for(Box box : arr){
                box.draw(g);
            }
        }
    }
}
