void main() {
    // some examples showing that any while loop can be a for loop and any for
    // loop can be a while loop

    String color = IO.readln("Enter the color red: ");
    // this is effectively a while loop:
    // for (;!color.equals("red");) {
    while (!color.equals("red")) {
        color = IO.readln("That's not red, try again: ");
    }
    IO.println("Thanks, bye!");

    // we can get really silly with the for loop
    // for (
    //         String color = IO.readln("Enter the color red: ");
    //         !color.equals("red");
    //         color = IO.readln("That's not red, try again: ")) {
    //     // no code in body
    // }
    // IO.println("Thanks, bye!");
}
