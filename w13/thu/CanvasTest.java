void main() {
    Canvas canvas = new Canvas(3, 2);
    canvas.setPixel(0xFF0000, 0, 0);
    canvas.setPixel(0x00FF00, 1, 0);
    canvas.setPixel(0x0000FF, 2, 0);
    canvas.setPixel(0xFFFF00, 0, 1);
    canvas.setPixel(0xFFFFFF, 1, 1);
    canvas.setPixel(0x000000, 2, 1);
    canvas.printPPM();

    // this should print the same ppm text you saw
    // in the wikipedia article (see image.ppm in the
    // class repo)
    //
    // we'll talk on 4/28 about saving this output to
    // a file, but you can look up I/O redirection if
    // you're feeling impatient:
    //
    // java CanvasTest.java > out.ppm
}
