void main() {
    double v = Double.parseDouble(IO.readln("v = "));
    double w = Double.parseDouble(IO.readln("w = "));
    double x = Double.parseDouble(IO.readln("x = "));
    double y = Double.parseDouble(IO.readln("y = "));
    double z = Double.parseDouble(IO.readln("z = "));

    // average of the first three numbers
    double avg1 = average(v, w, x);
    // when we call average(v, w, x), java will initialize average's parameters like this:
    // a = v
    // b = w
    // c = x
    IO.println(avg1);

    // average of the middle three numbers
    double avg2 = average(w, x, y);
    IO.println(avg2);

    // average of the last three numbers
    double avg3 = average(x, y, z);
    IO.println(avg3);

    // average of the averages
    double avg4 = average(avg1, avg2, avg3);
    IO.println(avg4);
    // this would also work, but it's kinda long
    // double avg4 = average(average(v, w, x), average(w, x, y), average(x, y, z));
}

void average_old() {
    double a = Double.parseDouble(IO.readln("Enter a number: "));
    double b = Double.parseDouble(IO.readln("Enter a number: "));
    double c = Double.parseDouble(IO.readln("Enter a number: "));
    double average = (a + b + c) / 3;
    IO.println("The average of " + a + ", " + b + ", and " + c + " is " + average + ".");
}

double average(double a, double b, double c) {
    double average = (a + b + c) / 3;

    return average;
}
