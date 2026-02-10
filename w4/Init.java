void main() {
	// declared, but not initialized
	String myVariable;
	
	IO.print("myVariable is equal to ");
	// compiler error because we're trying to use an uninitialized variable
	IO.println(myVariable);
}
