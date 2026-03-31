void main() {
    IO.println("Test createOdd");

    int n1 = Integer.parseInt(IO.readln("How large should the array be? "));
    int[] a1 = createOdd(n1);
    printArray(a1);

    IO.println("Test increaseBy10");

    increaseBy10(a1);
    printArray(a1);

    IO.println("Test average");
    double[] a3 = new double[] { 1, 2, 3, 4, 5 };
    double avg = average(a3);
    printArray(a3);
    IO.println("average: " + avg);

    IO.println("Test checkAllPositive");
    printArray(a3);
    IO.println("all positive? " + checkAllPositive(a3));
    double[] a5 = new double[] { 1, -1, 4, 5 };
    printArray(a5);
    IO.println("all positive? " + checkAllPositive(a5));

    IO.println("Test convertToInts");
    String[] a6 = new String[] { "10", "25", "100" };
    int[] b6 = convertToInts(a6);
    printArray(b6);
}

// 1. Create an array of odd numbers from 1 to n.
// using I/O functions instead of param/return
void createOddIO() {
    int n = Integer.parseInt(IO.readln("How large should the array be? "));
    int[] array = new int[n];
    int i = 0;
    while (i < array.length) {
        array[i] = i + 1;
        IO.println(array[i]);
        i = i + 1;
    }
}
// creates array with both odd and even
int[] createOdd1(int n) {
    // no need to prompt user because we have our parameter
    // int n = Integer.parseInt(IO.readln("How large should the array be? "));
    int[] array = new int[n];

    int i = 0;
    while (i < array.length) {
        array[i] = i + 1;
        // no need to print here once we have our printArray function
        // IO.println(array[i]);
        i = i + 1;
    }

    // we need to return the array so the caller has access to it
    return array;
}
// works as directed in prompt
int[] createOdd2(int n) {
    int len = (n + 1) / 2;
    int[] array = new int[len];

    int i = 0;
    while (i < array.length) {
        array[i] = 2 * i + 1;
        i = i + 1;
    }

    // we need to return the array so the caller has access to it
    return array;
}
// more sensible prompt: first n odd numbers starting at 1
int[] createOdd(int n) {
    int[] array = new int[n];

    int i = 0;
    while (i < array.length) {
        array[i] = 2 * i + 1;
        i = i + 1;
    }

    // we need to return the array so the caller has access to it
    return array;
}

// 2. Increase the value of each integer in an array by 10.
void increaseBy10(int[] array) {
    // no need for making our own array or converting types
    // String[] a = new String[] { "1", "2", "3", "4", "5", "6", ... };
    // int[] b = convertInt(number);

    int i = 0;
    while (i < array.length) {
        array[i] = array[i] + 10;

        i = i + 1;
    }
}

// 3. Calculate the average of an array of doubles.
double average(double[] array) {
    double sum = 0;
    int i = 0;
    while (i < array.length) {
        sum = sum + array[i];
        i = i + 1;
    }
    return sum / array.length;
}

// 4. Print the elements of an array as a comma-separated list.
void printArray(int[] array) {
    int i = 0;
    while (i < array.length) {
        // print, not println, to stay on the same line
        IO.print(array[i] + ", ");
        i = i + 1;
    }
    // line break after we're done
    IO.println();
}
void printArray(double[] array) {
    int i = 0;
    while (i < array.length) {
        // print, not println, to stay on the same line
        IO.print(array[i] + ", ");
        i = i + 1;
    }
    // line break after we're done
    IO.println();
}

// 5. Check whether all numbers in an array are positive.
boolean checkAllPositive(double[] array) {
    int i = 0;
    while (i < array.length) {
        if (array[i] <= 0) {
            return false;
        }
        i = i + 1;
    }

    return true;
}

// 6. Convert an array of strings to an array of integers (assume strings can be
//    parsed as ints).
int[] convertToInts(String[] strings) {
    // create an int array to hold parsed integers
    int[] integers = new int[strings.length];

    // counting loop for the strings array
    // will parse all strings as integers
    int i = 0;
    while (i < strings.length) {
        integers[i] = Integer.parseInt(strings[i]);

        // increment i at end of loop
        i = i + 1;
    }

    // return the parsed integers
    return integers;
}
