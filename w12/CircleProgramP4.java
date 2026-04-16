void main() {
    // initialize with default constructor
    Circle c1 = new Circle();
    // initialize with parameterized constructor
    Circle c2 = new Circle(5, 10, 100);

    IO.println("Here are our circles: ");
    IO.println(c1);
    IO.println(c2);

    IO.println("Here they are again but with our own print function:");
    Circle.printCircle(c1);
    Circle.printCircle(c2);
}
