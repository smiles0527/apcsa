package hat;


/**
 * A shape class for learning object construction.
 * @author Duncan Fraser
 * @version 2024
 */

/**
 *importing classes that have already been written
 *in order to use their methods - see .drawRect()
 */
import java.awt.*;
import java.awt.geom.*;

/**
 * start of class definition
 */
public class Rectangle1
{
	/**
	 * instance variables that hold the attributes of this object
	 * notice some have been initialized and some haven't
	 */
    private int xPosition;
    private int yPosition;
    private int width, height;
    private Color colour= Color.red;
    private boolean filled=false;

    /**
     * Default Constructor
     * constructors job is to give instance variables values 
     * this one initializes instance variables with default values
     * Creates a new Rectangle object with default location and size
     */
    public Rectangle1()
    {
        
        
        int x = 60, y = 50; 
        double w=50.7;
        xPosition = x;
        yPosition = y;
        width = (int)w;
        height = 30; 
        
    }
    
    public Rectangle1(int xx, int yy, int w, int h)
    {
        
        xPosition = xx;
        yPosition = yy;
        width = w;
        height = h;   
    }
    
    public Rectangle1(int xx, int yy, int w, int h, boolean f)
    {
        
        xPosition = xx;
        yPosition = yy;
        width = w;
        height = h;
        filled = f;
        
    }
    
    public void setPosition(int x, int y)
    {
    	xPosition = x;
        yPosition = y;
    }
    
    public void setcolour(int r, int g, int b)
    {
    	colour= new Color(r,g,b);
    }
    
    public Color getcolour()
    {
    	return colour;
    }

    /**
     * Method
     * notice it is public
     * draw method is called in another class and draws this object
     */
   
    public void draw(Graphics2D g2d)
    {
    	 
        g2d.setColor(colour);
        g2d.drawRect(xPosition,yPosition,width,height);  
        
       
     
        
       
}
    
   

}



