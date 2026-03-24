void main() {
    // create an array by specifying its size
    // this makes an array with ten elements containing all zeroes
    int[] a = new int[10];

    // assign values to each element of the array
    a[0] = 1;
    a[1] = 2;
    a[2] = 4;
    a[3] = 8;
    a[4] = 16;
    a[5] = 32;
    a[6] = 64;
    a[7] = 128;
    a[8] = 256;
    a[9] = 512;

    // print each element of the array
    IO.print("a's elements: ");
    IO.print(a[0] + " ");
    IO.print(a[1] + " ");
    IO.print(a[2] + " ");
    IO.print(a[3] + " ");
    IO.print(a[4] + " ");
    IO.print(a[5] + " ");
    IO.print(a[6] + " ");
    IO.print(a[7] + " ");
    IO.print(a[8] + " ");
    IO.println(a[9]);

    // can't index an array out of bounds
    // valid indices are 0 to length - 1
    // IO.println(a[-1]);
    // IO.println(a[10]);

    // print array's length
    IO.println("a contains " + a.length + " integers");
    // note that arrays have a fixed size, so we can't change the length
    // a.length = 15;

    // create an array by listing the initial elements
    int[] b = new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

    // we can reassign individual elements
    b[0] = 1024;

    // print b
    IO.print("b's elements: ");
    IO.print(b[0] + " ");
    IO.print(b[1] + " ");
    IO.print(b[2] + " ");
    IO.print(b[3] + " ");
    IO.print(b[4] + " ");
    IO.print(b[5] + " ");
    IO.print(b[6] + " ");
    IO.print(b[7] + " ");
    IO.print(b[8] + " ");
    IO.println(b[9]);
    IO.println("b contains " + b.length + " integers");

    // we cannot assign a single int to the whole array
    // b = 1024;
    // we can, however, reassign the whole array
    b = new int[] { 1, 1, 2, 3, 5 };

    IO.print("b's elements after reassignment: ");
    IO.print(b[0] + " ");
    IO.print(b[1] + " ");
    IO.print(b[2] + " ");
    IO.print(b[3] + " ");
    IO.println(b[4]);
    IO.println("b contains " + b.length + " integers");

    String[] c = new String[] { "A", "B", "C", "D", "E", "F" };

    // print the array using a counting loop
    IO.print("c's elements: ");
    int i = 0;
    while (i < c.length) {
        // do something with c[i]
        IO.print(c[i]);

        i = i + 1;
    }
    IO.println();

    // modify the array using a counting loop
    i = 0;
    while (i < c.length) {
        // simple transformation
        c[i] = c[i].toLowerCase();
        // more complex transformation
        // c[i] = (i + 1) + c[i] + c[i].toLowerCase();
        i = i + 1;
    }

    // print the array after modification
    IO.print("c's elements after modification: ");
    i = 0;
    while (i < c.length) {
        // do something with c[i]
        IO.print(c[i]);

        i = i + 1;
    }
    IO.println();

}
