public class Algorithms {
    public static void main(String[] args) {
        // test code to show that we're using the correct coordinates
        // fillRectangle(5, 11, 4, 3);
        drawRectangle(5, 11, 4, 3);
    }

    public static void fillRectangle(int x0, int y0, int w, int h) {
        // loops can be in either order: y then x or x then y
        // if we want to print in rows, then the outer loop should be y
        for (int y = y0; y < y0 + h; y++) {
            for (int x = x0; x < x0 + w; x++) {
                // print the coordinates
                System.out.print("(" + x + ", " + y + ") ");
            }
            // end the line
            System.out.println();
        }
    }

    // you can combine some of these loops to make it shorter, but you
    // don't have to
    public static void drawRectangle(int x0, int y0, int w, int h) {
        // print top edge
        for (int x = x0; x < x0 + w; x++) {
            System.out.print("(" + x + ", " + y0 + ") ");
        }
        System.out.println();
        // print bottom edge
        for (int x = x0; x < x0 + w; x++) {
            // TODO: bottom edge's y is y0 + h - 1
            System.out.print("(" + x + ", " + y0 + ") ");
        }
        System.out.println();

        // print left edge
        for (int y = y0; y < y0 + h; y++) {
            System.out.print("(" + x0 + ", " + y + ") ");
        }
        System.out.println();
        // print right edge
        for (int y = y0; y < y0 + h; y++) {
            // TODO: right edge's x is x0 + w - 1
            System.out.print("(" + x0 + ", " + y + ") ");
        }
        System.out.println();
    }
}
