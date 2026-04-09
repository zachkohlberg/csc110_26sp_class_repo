// shows our solutions converted to for loops
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

int[] createOdd(int n) {
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
        array[i] = 2 * i + 1;
    }
    return array;
}

// 2. Increase the value of each integer in an array by 10.
void increaseBy10(int[] array) {
    for (int i = 0; i < array.length; i++) {
        array[i] = array[i] + 10;
    }
}

// 3. Calculate the average of an array of doubles.
double average(double[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum = sum + array[i];
    }
    return sum / array.length;
}

// 4. Print the elements of an array as a comma-separated list.
void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        IO.print(array[i] + ", ");
    }
    IO.println();
}

void printArray(double[] array) {
    for (int i = 0; i < array.length; i++) {
        IO.print(array[i] + ", ");
    }
    IO.println();
}

// 5. Check whether all numbers in an array are positive.
boolean checkAllPositive(double[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] <= 0) {
            return false;
        }
    }
    return true;
}

// 6. Convert an array of strings to an array of integers (assume strings can be
//    parsed as ints).
int[] convertToInts(String[] strings) {
    int[] integers = new int[strings.length];
    for (int i = 0; i < strings.length; i++) {
        integers[i] = Integer.parseInt(strings[i]);
    }
    return integers;
}
