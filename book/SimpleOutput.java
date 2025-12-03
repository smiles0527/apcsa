package book;

/**
 * Simple output helper used in the Chapter 2 Book Lab.
 * This mirrors the functionality of the SimpleOutput class created earlier in the course.
 */
public final class SimpleOutput {

    private SimpleOutput() {
        // Prevent instantiation.
    }

    public static void show(String message) {
        System.out.println("[SimpleOutput] " + message);
    }
}


