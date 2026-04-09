// Problem: take the user's name as a series of program args
// - 1 arg: the user's first name
// - 2 args: the user's first name followed by their last name
// - 3 args: the user's first name, middle name, and last name
void main(String[] args) {
    String name = "";
    boolean error = false;

    // handle arguments
    if (args.length == 1) {
        // first
        String first = args[0];

        // name is "First"
        name = first;
    } else if (args.length == 2) {
        // first last
        String first = args[0];
        String last = args[1];

        // name is "First Last"
        name = first + " " + last;
    } else if (args.length == 3) {
        // first middle last
        String first = args[0];
        String middle = args[1];
        String last = args[2];

        // name is "First M. Last"
        name = first + " " + middle.charAt(0) + ". " + last;
    } else {
        // error
        error = true;
    }

    // output

    if (!error) {
        IO.println("Hello " + name + ", nice to meet you!");
    } else {
        IO.println("ERROR: wrong number of arguments.");
        IO.println("USAGE:");
        IO.println("java NameArgs.java FIRST");
        IO.println("java NameArgs.java FIRST LAST");
        IO.println("java NameArgs.java FIRST MIDDLE LAST");
    }
}
