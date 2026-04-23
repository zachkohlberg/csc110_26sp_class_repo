void main() {
    Canvas canvas = new Canvas(3, 2);
    canvas.setPixel(0, 0, 0xFF0000);
    canvas.setPixel(1, 0, 0x00FF00);
    canvas.setPixel(2, 0, 0x0000FF);
    canvas.setPixel(0, 1, 0xFFFF00);
    canvas.setPixel(1, 1, 0xFFFFFF);
    canvas.setPixel(2, 1, 0x000000);
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
