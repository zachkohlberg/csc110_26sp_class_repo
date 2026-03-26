void main() {
    // Test #6
    String[] a6 = new String[] { "10", "25", "100" };

    int[] b6 = convertToInts(a6);
    IO.println(b6[0]);
    IO.println(b6[1]);
    IO.println(b6[2]);
    int sum = b6[0] + b6[1] + b6[2];
    IO.println(sum);
}

// 1. Create an array of odd numbers from 1 to n.
int[] createOdd(int n) {...}

// 2. Increase the value of each integer in an array by 10.
void increaseBy10(int[] array) {...}

// 3. Calculate the average of an array of doubles.
double average(double[] array) {...}

// 4. Print the elements of an array as a comma-separated list.
void printArray(int[] array) {...}

// 5. Check whether all numbers in an array are positive.
boolean checkAllPositive(double[] array) {...}

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
