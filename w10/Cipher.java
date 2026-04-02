void main() {
    String msg = IO.readln("Enter a message: ");
    IO.println("ROT13 encoded: " + cipher(msg));
}

String cipher(String msg) {
    String msgCipher = "";

    // we can treat strings like arrays, except we can't reassign their elements
    // str.length() gets the length, just like array.length
    // str.charAt(index) gets a character at an index, just like array[index]
    // therefore, the same counting loop we use for arrays can be adapted to strings:
    int i = 0;
    while (i < msg.length()) {
        char x = msg.charAt(i);
        char xCipher = cipherChar(x);
        msgCipher = msgCipher + xCipher;

        i = i + 1;
    }

    return msgCipher;
}

char cipherChar(char x) {
    // HINT: checking whether a char is between 'a' and 'z' is no different than
    // checking whether an int is between 1 and 10, just use the appropriate inequality operators
    if (???) { // check for uppercase letter
        // capital letter
        int xIndex = x - 'A';
        int xIndexShifted = (xIndex + 13) % 26;
        return (char)(xIndexShifted + 'A');
    } else if (???) { // check for lowercase letter
        // lowercase letter
        // TODO: cipher for lowercase letter
    } else {
        // other
        return x;
    }
}
