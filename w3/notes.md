# Week 3 Notes

## Java Program Structure

- compact source: shorter structure for Java programs introduced in Java 25 (previewed starting in Java 21)
- program has a main function as its entry point
- begins executing code in the main function when the program runs

### Comments

Lines starting with `//` are comments. These are ignored by the compiler.

Reasons for comments:

- Notes
- Documentation
- Reminders (TODO comments)

### Main Function

Several parts:

- Return type: `void`
  - Don't worry about this for now, functions will just start with "void"
- Name: `main()`
  - Include empty parenthesis after the function name
- Body: `{ ... }`
  - This contains all the code that runs when we call the main function

### Print Statements

Several parts:
- Function call: `IO.println(...)`
  - The name ("IO.println") of the function followed by parenthesis containing its arguments
- Argument: `"Hello World"`
  - This is a "String", or text
  - Functions take arguments when they need additional data to do their job
- Semicolon: `;`
  - End of a statement
  - Most lines of code end with semicolons

## Input and Output (I/O)

- input: information entering a program or other system
- output: information exiting a program or other system
- input sources
	- keyboard
	- mouse
	- microphone
	- camera
	- gamepad/controller
- output
	- printing to a terminal
	- save to a file
	- displaying something on a monitor
	- playing a sound
	- printing to a real printer
	- sending an email or communicating over the internet
- one program's output can be another program's input

our programs will use "standard input" and "standard output"

- standard input (stdin) is read from the terminal
- standard output (stdout) is printed to the terminal

## Outputting to stdout

- Two output functions:
  - `IO.println(...)`
  - `IO.print(...)`

## Functions

- a function is a named block of code that can be run by calling its name
- functions starting with `void` do not return any information (old term for this is "subroutine")
- namespace: if you want to reuse names without conflict, you can use different "namespaces" to differentiate them
  - different languages have their own ways to create namespaces, and java's are packages and classes
  - `IO` is a class, which for now just means "a container of functions"

what can we do with functions?

- we can call functions
  - calling our own functions is simple: write the name followed by empty parenthesis: ()
  - calling built-in functions requires the function's class, followed by a dot, followed by the function's name
  - if a function takes arguments, these go in the parenthesis after its name
- we can define our own functions
  - follow the format "void name() { ... }"
  - all functions will start with `void` for now
  - we can use any name, but it must be a valid "identifier" (see below)
  - all the function's code goes in between the curly braces

## Identifiers

Functions, variables, classes, and other objects have identifiers (names). Identifier rules:

- can contain letters, digits, underscores, and dollar signs
- cannot start with a digit
  - "1abc" is not a valid identifier
  - "a123" is a valid identifier

## Variables

- name associated with a piece of data
  - can think of them as labeled boxes that you can store data in
- what can we do with variables?
  - **declaring** a variable means to create the variable
  - **initializing** a variable means assigning it an initial value
  - **assigning** or **reassigning** a value to a variable associates the name with the value
  - we can use variables in other code, which will retrieve and use whatever value was last assigned to the variable

```java
// declare a variable: Type name;
String x;

// assign/reassign a variable: name = value;
x = "hello";

// use a variable in other code by typing its name
IO.println(x);
```

## Input

- `IO.readln(...)` reads user input
- to use the input, you need to store it in a variable:

```java
String x = IO.readln(...);
```
