void main() {
    // read from standard input
    int totalInches = Integer.parseInt(IO.readln());

    // calculations
    int inches = totalInches % 12;
    int feet = totalInches / 12;

    // print to standard output
    IO.println(feet + "'" + inches + "\"");
}
