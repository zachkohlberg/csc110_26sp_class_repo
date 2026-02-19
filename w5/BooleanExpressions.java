// File: BooleanExpressions.java

void main() {
    int x = Integer.parseInt(IO.readln("Enter a value for x (must be an integer): "));

//  boolean variable declaration
//  vvvvvvvvvvvvvv
    boolean isFive = x == 5;
//                   ^^^^^^
//                   boolean expression
    // more variables initialized with boolean expressions
    boolean isPositive = x > 0;
    boolean isMultipleOfTen = x % 10 == 0;

    // printing the resulting boolean values as answers to questions
    IO.println("Is x five? " + isFive);
    IO.println("Is x positive? " + isPositive);
    IO.println("Is x a multiple of ten? " + isMultipleOfTen);
}

