// Arithmetic.java
void main() {
    // Input
    int x = Integer.parseInt(IO.readln("Please enter a value for x: "));
    int y = Integer.parseInt(IO.readln("Please enter a value for y: "));

    // Calculations
    // Declaring variables without initializing them
    // int sum, difference, product, quotient, remainder;
    // // Initializing declared variables
    // sum = x + y;
    // difference = x - y;
    // product = x * y;
    // quotient = x / y;
    // remainder = x % y;

    // Output
    IO.println("x + y = " + (x + y));

    // equivalent to above
    // IO.print("x + y = ");
    // IO.println(sum);

    // incorrect
    // IO.println("x + y = sum");
    // IO.println("x + y = + sum");

    IO.println("x - y = " + (x - y));
    IO.println("x * y = " + (x * y));
    IO.println("x / y = " + (x / y));
    IO.println("x % y = " + (x % y));
}

// Questions:
// - What happens if we try to print those variables without initializing them?
// - What happens if we write "int sum = x + y" instead of "sum = x + y"? When
//   is it correct to state a variable's type?
// - What happens when the second number is zero?
// - What happens if the user enters a word instead of a number?
// - What happens if you enter a non-integer number, like 2.5?
// - Try changing the program to use doubles instead of integers. How does that
//   change the answers to the last three questions? Remember to use
//   Double.parseDouble instead of Integer.parseInt.
// - Try removing all variables except x and y and moving the calculations to
//   the print statements. Which print statements still work correctly, and
//   which do not? Why?

