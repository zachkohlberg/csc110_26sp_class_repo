void main() {
    int n = Integer.parseInt(IO.readln("Enter an integer: "));

    String c = parity(n);
    String b = sign(n);

    IO.println("Your number is " + c + " and " + b + ".");
}

String parity(int n) {
    if (n % 2 == 0) {
        return "even";
    } else {
        return "odd";
    }
}

String sign(int n) {
    if (n > 0) {
        return "positive";
    } else if (n < 0) {
        return "negative";
    } else {
        return "zero";
    }
}
