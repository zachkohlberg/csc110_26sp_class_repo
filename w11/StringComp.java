void main() {
    String s1 = "hello";

    String s2 = "hello"; // == works correctly
    // try swapping out the line above with each of the alternate versions below

    // String s2 = "h" + "ello"; // == works correctly

    // String s2 = "Hello".toLowerCase(); // == DOES NOT work correctly

    // String s2 = new String("hello"); // == DOES NOT work correctly

    // String s2 = IO.readln("Type \"hello\" and press enter or I'll exit the program!\n"); // == DOES NOT work correctly
    // if (!s2.equals("hello")) {
    //     IO.println("You didn't listen.");
    //     return;
    // }

    IO.println("s1 = \"" + s1 + "\"");
    IO.println("s2 = \"" + s2 + "\"");

    if (s1 == s2) {
        IO.println("According to the == operator: s1 is equal to s2.");
    } else {
        IO.println("According to the == operator: s1 is NOT equal to s2.");
    }

    if (s1.equals(s2)) {
        IO.println("According to the .equals method: s1 is equal to s2.");
    } else {
        IO.println("According to the .equals method: s1 is NOT equal to s2.");
    }

    // some questions to answer:
    // - which of these are considered equal by the == operator?
    // - which of these are considered equal by the .equals method?
    // - which of these should be considered equal?
    // - when should we compare strings with == and when should we compare strings with .equals?
    //
    // youtube has a lot of explanations for this, such as
    // <https://www.youtube.com/watch?v=AoUVdLWLFQw>
}
