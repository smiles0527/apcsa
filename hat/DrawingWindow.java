package hat;

import javax.swing.*;
import java.awt.*;

public class DrawingWindow {

   public static void main(String[] args) {
       // Create a JFrame (window) and set its properties
       JFrame frame = new JFrame("drawline() Example");
       frame.setSize(400, 400); // Set the size of the window
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation


       // Create a JPanel to draw on
       JPanel panel = new JPanel() {
           @Override
           protected void paintComponent(Graphics g) {
               super.paintComponent(g);


               g.setColor(Color.BLUE); // Set the drawing color to blue
               Graphics2D g2d = (Graphics2D) g;


               // Test drawLine(int,int,int,int) here
               g2d.drawLine(100,100,200,200);
           }
       };


       // Add the JPanel to the JFrame
       frame.add(panel);


       // Make the JFrame visible
       frame.setVisible(true);
   }
}



