void main() {
    // initialize with default constructor
    Circle c1 = new Circle();
    // initialize with parameterized constructor
    Circle c2 = new Circle(5, 10, 100);

    IO.println("Here are our circles: ");
    IO.println(c1);
    IO.println(c2);

    IO.println("Here they are again but with our own print function:");
    printCircle(c1);
    printCircle(c2);
}

void printCircle(Circle c) {
    IO.println("Circle:");
    IO.println("  x: " + c.x);
    IO.println("  y: " + c.y);
    IO.println("  r: " + c.radius);
}

// circle class with instance variables and constructors
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
}
