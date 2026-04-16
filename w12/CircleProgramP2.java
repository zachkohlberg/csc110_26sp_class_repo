void main() {
    // we can create our circles
    // c1 and c2 have references to INSTANCES of the circle class
    Circle c1 = new Circle();
    Circle c2 = new Circle();
    // this doesn't create a new circle, it just references another circle
    Circle c3 = c2;

    // we can set the instance variables of each circle
    c1.x = 5;
    c1.y = 10;
    c1.radius = -3;

    // c2 and c3 reference the same object, so these will all modify the same
    // circle's x, y, and radius values
    c2.x = -1;
    c2.y = -2;
    c3.y = 100;
    c3.radius = 50;

    IO.println("Here are our circles: ");
    // we can print our circles
    IO.println(c1);
    IO.println(c2);

    IO.println("Here they are again but with our own print function:");
    printCircle(c1);
    printCircle(c2);
    printCircle(c3);

    // but not much else
}

void printCircle(Circle c) {
    IO.println("Circle:");
    IO.println("  x: " + c.x);
    IO.println("  y: " + c.y);
    IO.println("  r: " + c.radius);
}

// circle class with variables
// the class defines what a circle is
class Circle {
    int x;
    int y;
    int radius;
}
