class Canvas {
    // instance variables

    // pixel data as a 2d array of integers
    int[][] pixels;
    // canvas dimensions
    // NOTE: height comes first when indexing/creating the pixels array
    int width;
    int height;

    Canvas(int w, int h) {
        // initialize width to the appropriate parameter
        width = w;
        // TODO: initialize height
        // TODO: create the array, remember height then width
        pixels = new int[...
    }

    int getPixel(int x, int y) {
        // TODO: return the pixel at x, y
        // NOTE: remember that y comes before x when indexing the array
    }

    void setPixel(int color, int x, int y) {
        // TODO: set the pixel at x, y to color
        // NOTE: remember that y comes before x when indexing the array
    }

    void printPPM() {
        // TODO: print magic bytes: "P3"

        // TODO: print width and height

        // TODO: print max color value: 255

        // TODO: print color data (use printPixelRGB, loop through 2d pixels array)
        // iterate over each row
        for (int row = 0; row < height; row++) {
            // TODO: iterate over each column
            // NOTE: column corresponds to width, not height
            for (...) {
                // TODO: call printPixelRGB on appropriate pixel
            }
        }
    }

    // outputs ppm data for one pixel
    void printPixelRGB(int color) {
        int red = (color & 0x00ff0000) >>> 16;
        // either order works, just make sure the mask is where you expect the
        // red bits to be:
        // int red = (color >>> 16) & 0x000000ff;
        int green = (color & 0x0000ff00) >>> 8;
        int blue = color & 0x000000ff;
        System.out.println(red + " " + green + " " + blue);
    }

    void drawRectangle(int color, int x, int y, int w, int h) {
        // TODO: implement, see Algorithms.java
        // TODO: set pixel instead of printing color/coordinates
    }

    void fillRectangle(int color, int x, int y, int w, int h) {
        // TODO: implement, see Algorithms.java
        // TODO: set pixel instead of printing color/coordinates
    }

    void drawLine(int color, int x0, int y0, int x1, int y1) {
        // TODO
    }
}
