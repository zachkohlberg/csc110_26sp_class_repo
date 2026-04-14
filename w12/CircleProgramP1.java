void main() {
    // we can create our circles
    Circle c1 = new Circle();
    Circle c2 = new Circle();

    IO.println("Here are our circles: ");
    // we can print our circles
    IO.println(c1);
    IO.println(c2);

    // but not much else

    // we can do the same with strings
    String s1 = new String();
    String s2 = new String();
    IO.println("Some strings:");
    IO.println(s1);
    IO.println(s2);
}

// minimal circle class
class Circle {}
