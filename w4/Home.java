// Filename: Home.java

void main() {
    String user = IO.readln("What is your username? ");

    IO.print("  Linux: /home/");
    IO.print(user);
    IO.print("\n");

    IO.print("    Mac: /Users/");
    IO.println(user);

    IO.print("Windows: /c/Users/");
    IO.println(user);

    IO.print("      or C:\\Users\\");
    IO.println(user);
}
// We'll talk about why "\\" prints as "\" later
// escape sequences are used to output special characters
// always start with a backslash: \
//        linefeed: \n
// carriage return: \r
//       backslash: \\
//             tab: \t
//    double-quote: \"
