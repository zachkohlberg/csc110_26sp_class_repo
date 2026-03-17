void main() {
    test(0.1 + 0.2, 0.3);
    test(3.14, Math.PI);
    test(3.1415926, Math.PI);
}

void test(double a, double b) {
    IO.println("Is " + a + " equal to " + b + "? " + approxEqual(a, b));
}


// returns true if a and b are approximately the same and false if they aren't
// by "approximately the same", we mean they have a difference of less than
// 1 / 1,000,000
boolean approxEqual(double a, double b) {
    // our margin of error is 1 / 1,000,000
    // differences smaller than this will be treated as 0
    double epsilon = 0.000001;

    // difference between a and b
    double delta = a - b;
    // absolute value so we don't have to worry about negatives
    double absoluteDelta = Math.abs(delta);

    // if the difference is smaller than the error margin, then the numbers are
    // approximately equal
    if (absoluteDelta < epsilon) {
        return true;
    } else {
        return false;
    }

    // this does the same thing as the above if statement and is generally how
    // we'd prefer to write it
    // return absoluteDelta < epsilon;
}
