void main() {
    // initialize with default constructor
    Circle c1 = new Circle(5, 10, 100);
    // initialize with parameterized constructor
    Circle c2 = new Circle(5, 10, 100);

    IO.println("Here are our circles: ");
    // printing an object will automatically call its toString method
    IO.println(c1);
    // we can also call it explicitly
    IO.println(c2.toString());
    // it also comes with a .equals method
    IO.println("Are they the same? " + c1.equals(c2));

    IO.println("Here they are again but with our own print function:");
    c1.print();
    c2.print();
}
