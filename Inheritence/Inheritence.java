import java.awt.*;
import javax.swing.*;

public class Inheritence{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setContentPane(new Grid(4, 5));
        frame.setSize(1920,1080);
    }
}