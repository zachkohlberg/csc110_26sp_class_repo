// file: Input.java

void main() {
    int x = Integer.parseInt(IO.readln("Enter a positive number: "));

    // force user to enter a positive number before continuing
    while (x <= 0) {
        // error message for user
        IO.println("ERROR: " + x + " is not a positive number!");

        // repeat the prompt
        x = Integer.parseInt(IO.readln("Enter a positive number: "));
    }

    IO.println("Your number is " + x + ".");
}

// practice exercises
// - what if we used a different variable inside the loop? (`int y = ...`
//   instead of `x = ...` on line 12)
// - what happens if we change `x = ...` to `int x = ...` on line 12?
// - how would we ask for two positive numbers instead of just one?
// - how would we ask for x to be between 1 and 100 (inclusive) instead of
//   accepting any positive number?
// - what happens if the user doesn't enter an integer? what kinds of user
//   mistakes can we handle with this kind of loop?

