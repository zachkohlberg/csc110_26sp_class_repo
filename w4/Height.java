// Height.java
void main() {
    // Input
    // prompt and conversion in separate steps
    String totalInchesString = IO.readln("How tall are you in inches?");
    int totalInches = Integer.parseInt(totalInchesString);

    // Calculations
    // calling our own functions to perform the calculations
    int feet = inchesToFeet(totalInches);
    int inches = remainingInches(totalInches);

    // Output
    IO.println("Your height is " + feet + "'" + inches + "\".");
}

int inchesToFeet(int inches) {
    return inches / 12;
}

int remainingInches(int inches) {
    return inches % 12;
}
