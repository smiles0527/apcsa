package ellipse;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel {
    private final int[] xs = {100, 50, 250};
    private final int[] ys = {50, 220, 220};

    public Triangle() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(320, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Polygon p = new Polygon(xs, ys, 3);
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(6));
        g2.drawPolygon(p);
        g2.setColor(new Color(0, 255, 0, 100));
        g2.fillPolygon(p);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Triangle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Triangle());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
