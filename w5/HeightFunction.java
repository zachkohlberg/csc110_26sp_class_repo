// File: HeightFunction.java

// A variation of last week's Height.java where we only have one function that
// converts inches to a height string
void main() {
    int inches = Integer.parseInt(IO.readln("How tall are you in inches? "));

    // this line of code *calls* convertToHeight
    // - calling a function runs the code in its body
    // - inches is passed as an *argument* to the function
    //   - an argument is assigned to one of the function's parameters when
    //     the function's body is executed
    // - convertToHeight returns a String, so a call to that function is a
    //   String expression, which can be assigned to a variable or used
    //   anywhere we could use a String
    String height = convertToHeight(inches);

    IO.println("Your height is " + height + ".");
    IO.println("55 inches is " + convertToHeight(55) + ".");
    IO.println("67 inches is " + convertToHeight(67) + ".");
    IO.println("80 inches is " + convertToHeight(80) + ".");
}

// everything below is a function definition
// - defining a function does NOT run run any code in its body
// - int totalInches declares a parameter, which can be used in the function
//   body
//   - you don't need to assign to a parameter yourself
//   - a parameter is initialized with one of the arguments when we call the
//     function
// - 

// function declaration, parameters (input)
String convertToHeight(int totalInches) {
    // NEVER assign to a parameter at the start of your function
    // the parameter is already assigned one of the arguments, so this just
    // deletes the argument
    //
    // totalInches = IO.readln(...);

    // calculations
    int inches = totalInches % 12;
    int feet = totalInches / 12;

    // return statement (output)
    return feet + "'" + inches + "\"";
}

