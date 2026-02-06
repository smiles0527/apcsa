package Chapter5Labs/QuadrantFinder;

public class QuadrantTester
{
    public static String findQuadrant(Point p)
    {
        double x = p.getX();
        double y = p.getY();

        if(x == 0 && y == 0) return "Origin";
        if(x == 0) return "On Y Axis";
        if(y == 0) return "On X Axis";
        if(x > 0 && y > 0) return "Quadrant I";
        if(x < 0 && y > 0) return "Quadrant II";
        if(x < 0 && y < 0) return "Quadrant III";
        return "Quadrant IV";
    }

    public static void main(String[] args)
    {
        Point a = new Point(3, 4);
        Point b = new Point(-2, 5);
        Point c = new Point(0, 0);

        System.out.println(findQuadrant(a));
        System.out.println(findQuadrant(b));
        System.out.println(findQuadrant(c));
    }
}
