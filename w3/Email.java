void main() {
	// we can call email multiple times from main to repeat the whole process
	email();
	// do we actually want to do that? probably not with this program
	// email();
	
	// we can add another level of "indirection" by calling a function that calls
	// email instead of calling email directly
	// indirect();
}

void indirect() {
	email();
}

// used to be our main function, but now we want to call it multiple times from
// our main function
void email() {
	// prompt for first name
	String firstName = IO.readln("What's your first name?");

	// prompt for last name
	String lastName = IO.readln("What's your last name?");

	// print email
	IO.print(firstName);
	IO.print(".");
	IO.print(lastName);
	IO.println("@qu.edu");
}
