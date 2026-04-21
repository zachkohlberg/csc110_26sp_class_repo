void main() {
    // create a new scanner to read from standard input with the System.in
    // InputStream
    Scanner input = new Scanner(System.in);

    // prompt and read user's favorite color
    System.out.println("What is your favorite color?");
    String color = input.nextLine();

    // prompt and read a number
    System.out.println("On a scale of 1 to 10, how much do you like " + color + "?");
    int n = Integer.parseInt(input.nextLine());
    // you can also use one of the methods that reads and parses input into another type
    // int n = input.nextInt();

    // repeat color however many times the user said
    System.out.println("Thanks! Now I'll print " + color + " " + n + " times.");
    for (int i = 0; i < n; i++) {
        System.out.println(color);
    }
}
