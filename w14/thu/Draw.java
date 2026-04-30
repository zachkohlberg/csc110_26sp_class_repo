public class Draw {
    public static void main(String[] args) {
        parseCommandList();
    }

    public static void parseCommandList() {
        // TODO: convert the rest of the pseudocode to code below
        int width = Integer.parseInt(IO.readln());
        height = read int
        Canvas canvas = new Canvas(width, height);

        String command = IO.readln();
        while command isn't quit
            execute command
            command = read line

        canvas.printPPM();
    }

    public static void executeCommand(Canvas canvas, String command) {
        // TODO: convert the pseudocode to code below
        parts = split command around spaces
        name = parts[0]
        color = parts[1] parsed as 16-bit int
        arg0, arg1, arg2, and arg3 = parts[2 to 5] parsed as ints
        if name is draw_rect
            canvas.drawRectangle(...)
        else if name is fill_rect
            canvas.fillRectangle(...)
        else if name is draw_line
            canvas.drawLine(...)
    }
}
