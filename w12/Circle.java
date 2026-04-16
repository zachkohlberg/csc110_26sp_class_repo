// now circle class is in its own file
class Circle {
    // instance variables
    int x;
    int y;
    int radius;

    // writing our own default constructor
    Circle() {
        x = 0;
        y = 0;
        radius = 0;
    }

    // writing a parameterized constructor
    Circle(int initX, int initY, int initRadius) {
        x = initX;
        y = initY;
        radius = initRadius;
    }

    // static methods

    static double areaOfCircle(Circle c) {
        return Math.PI * c.radius * c.radius;
    }

    static double circumferenceOfCircle(Circle c) {
        return 2 * Math.PI * c.radius;
    }

    static void printCircle(Circle c) {
        IO.println("Circle:");
        IO.println("  x: " + c.x);
        IO.println("  y: " + c.y);
        IO.println("  r: " + c.radius);
        IO.println("  A: " + areaOfCircle(c));
        IO.println("  C: " + circumferenceOfCircle(c));
    }

    // instance methods

    double area() {
        return Math.PI * radius * radius;
    }

    // we can write instance methods with the "this" keyword to
    // refer to the instance it's being called on, but using "this"
    // is usually not necessary
    //
    // it's like the method has an implicit paramater called this of type Circle:
    // double area(Circle this)...
    // double area() {
    //     return Math.PI * this.radius * this.radius;
    // }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void print() {
        IO.println("Circle:");
        IO.println("  x: " + x);
        IO.println("  y: " + y);
        IO.println("  r: " + radius);
        IO.println("  A: " + area());
        IO.println("  C: " + circumference());
    }

    // needs to be public, we'll get into why later
    public String toString() {
        return "Circle:\n" +
            "  x: " + x + "\n" +
            "  y: " + y + "\n" +
            "  r: " + radius;
    }

    // NOTE: not exactly how we'd normally replace equals, but it'll work for now
    boolean equals(Circle other) {
        return x == other.x && y == other.y && radius == other.radius;
    }
}
