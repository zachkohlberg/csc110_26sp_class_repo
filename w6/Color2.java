void main() {
    // input
    String color = IO.readln("What's your favorite color? ");

    boolean isPurple = color.equalsIgnoreCase("purple");
    boolean isRed = color.equalsIgnoreCase("red");
    boolean isGreen = color.equalsIgnoreCase("green");
    boolean isBlue = color.equalsIgnoreCase("blue");

    // ifs
    if (isPurple) {
        IO.println("Great choice!");
    } else if (isRed || isGreen || isBlue) {
    // let's say color was blue:
    //         isRed || isGreen || isBlue
    //         false || false   || true
    //                |
    //                |
    //                V
    //              false       || true
    //                           |
    //                           |
    //                           V
    //                         true
        IO.println("That's boring.");
    } else {
        IO.println("I don't care about that color.");
    }
}
