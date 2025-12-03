package iflab;

public class QuadrantFinder {

    public static void main(String[] args) {
        // Test cases
        testPoint(new Point(1, 1), "Quadrant I");
        testPoint(new Point(-1, 1), "Quadrant II");
        testPoint(new Point(-1, -1), "Quadrant III");
        testPoint(new Point(1, -1), "Quadrant IV");
        testPoint(new Point(0, 0), "Origin");
        testPoint(new Point(0, 5), "y-axis");
        testPoint(new Point(5, 0), "x-axis");
    }

    public static void testPoint(Point p, String expected) {
        String result = findQuadrant(p);
        System.out.println("Point (" + p.getX() + ", " + p.getY() + ") is in " + result + ". Expected: " + expected);
    }

    public static String findQuadrant(Point p) {
        double x = p.getX();
        double y = p.getY();

        if (x == 0 && y == 0) {
            return "Origin";
        } else if (x == 0) {
            return "y-axis";
        } else if (y == 0) {
            return "x-axis";
        } else if (x > 0 && y > 0) {
            return "Quadrant I";
        } else if (x < 0 && y > 0) {
            return "Quadrant II";
        } else if (x < 0 && y < 0) {
            return "Quadrant III";
        } else { // x > 0 && y < 0
            return "Quadrant IV";
        }
    }
}
