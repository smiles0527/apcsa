import javax.swing.JFrame;

public class ViewWindowChallenge{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Challenge - Resizable Ellipse");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EllipseComponent component = new EllipseComponent();
        frame.add(component);

        frame.setVisible(true);

        // Print instructions
        System.out.println("Try resizing the window!");
        System.out.println("The ellipse will always fill the window boundaries.");
    }
}