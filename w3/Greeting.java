// Filename: Greeting.java

void main() {
	// declare the "name" variable
    String name;
    
    // initialize name to something
    // IO.readln will print a message, wait for the user to type a response,
    // and then return whatever text the user typed as a String
    // we usually want to store this input in a variable
    name = IO.readln("What is your name? ");
    
    // print some stuff, who cares
    IO.print("Hello ");
    IO.print(name);
    IO.println(", nice to meet you!");
}
