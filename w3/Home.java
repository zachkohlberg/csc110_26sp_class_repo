// Filename: Home.java

void main() {
	// declare a variable named "user"
	// initialize user to the string "zach"
    // String user = "bob";

	// declare
	String user;
	// initialize
	user = "bob";
	// reassigns user, replacing the old value
	user = "zach";

    IO.print("  Linux: /home/");
    // print the contents of the "user" variable
    IO.println(user);

    IO.print("    Mac: /Users/");
    IO.println(user);

    IO.print("Windows: /c/Users/");
    IO.println(user);

    IO.print("      or C:\\Users\\");
    IO.println(user);
}
// We'll talk about why "\\" prints as "\" later
