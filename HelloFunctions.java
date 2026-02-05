// Filename: HelloFunctions.java

// this defines the function, but doesn't run any of the code inside it
// this function will only run if we call it from main
void sayHello() {
    IO.println("Hello, user!");
    IO.println("Nice to meet you.");
}

void sayGoodbye() {
    IO.println("Guess we're out of time. Bye!");
}

// main is our program's entry point
// the JVM will always start by calling our main function
void main() {
	// we can call a function multiple times to repeat all of its code
    sayHello();
    sayHello();
    sayHello();
    sayGoodbye();
}
