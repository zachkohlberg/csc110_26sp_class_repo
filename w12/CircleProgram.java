void main() {
    // we can create our circles
    Circle c1 = new Circle();
    Circle c2 = new Circle();

    // we can set the instance variables of each circle
    c1.x = 5;
    c1.y = 10;
    c1.radius = -3;
    c2.x = -1;
    c2.y = -2;
    c2.radius = 100;

    IO.println("Here are our circles: ");
    // we can print our circles
    IO.println(c1);
    IO.println(c2);

    IO.println("Here they are again but with our own print function:");
    printCircle(c1);
    printCircle(c2);

    // but not much else
}

void printCircle(Circle c) {
    IO.println("Circle:");
    IO.println("  x: " + c.x);
    IO.println("  y: " + c.y);
    IO.println("  r: " + c.radius);
}

// circle class with variables
class Circle {
    int x;
    int y;
    int radius;
}
