// we'd need to rename this file Circle.java to use it because
// class names must match file names

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
}
