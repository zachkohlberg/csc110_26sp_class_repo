public class RectangleTest {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(200, 200);
        canvas.fillRectangle(0xFFFFFF, 25, 50, 150, 100);
        canvas.drawRectangle(0x0000FF, 25, 50, 150, 100);
        canvas.printPPM();
    }
}

// this should create an image with a white rectangle with a
// blue border on a black background
//
// remember to use output redirection to print it to a file:
//
// java RectangleTest.java > rectangle.ppm
//
// then you can open rectangle.ppm in an image viewer to check
// whether it worked correctly
