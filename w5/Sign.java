// File: Sign.java

void main() {
    int n = Integer.parseInt(IO.readln("Enter an integer: "));

    if (n > 0) {
        IO.println("Your number is positive.");
    } else if (n < 0) {
        IO.println("Your number is negative.");
    } else {
        IO.println("Your number is zero.");
    }
}

