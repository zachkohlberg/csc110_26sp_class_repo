void main() {
    // input
    String color = IO.readln("What's your favorite color? ");

    boolean isPurple = color.equalsIgnoreCase("purple");
    boolean isRed = color.equalsIgnoreCase("red");

    // ifs
    if (isPurple) {
        IO.println("Great choice!");
    } else if (isRed) {
        IO.println("That's boring.");
    } else if (color.equalsIgnoreCase("green")) {
        IO.println("That's boring.");
    } else if (color.equalsIgnoreCase("blue")) {
        IO.println("That's boring.");
    } else {
        IO.println("I don't care about that color.");
    }
}
