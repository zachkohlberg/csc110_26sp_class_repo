void main() {
    // create the table:
    //
    //  1  2  3  4
    //  5  6  7  8
    //  9 10 11 12
    // 13 14 15 16

    // assign each element manually
    // not very convenient
    int[][] table = new int[4][4];
    table[0][0] = 1;
    table[0][1] = 2;
    table[0][2] = 3;
    table[0][3] = 4;
    table[1][0] = 5;
    table[1][1] = 6;
    table[1][2] = 7;
    table[1][3] = 8;
    table[2][0] = 9;
    table[2][1] = 10;
    table[2][2] = 11;
    table[2][3] = 12;
    table[3][0] = 13;
    table[3][1] = 14;
    table[3][2] = 15;
    table[3][3] = 16;

    IO.println("Handcrafted table:");
    printTable(table);

    IO.println("makeTable(4, 4):");
    printTable(makeTable(4, 4));

    IO.println("makeTable(10, 7):");
    printTable(makeTable(10, 7));
}

int[][] makeTable(int rows, int cols) {
    int[][] table = new int[rows][cols];
    // outer loop iterates over rows
    for (int row = 0; row < rows; row++) {
        // inner loop iterates over colums within a row
        for (int col = 0; col < cols; col++) {
            table[row][col] = 1 + col + row * cols;
        }
    }
    return table;
}

void printTable (int[][] table) {
    for (int row = 0; row < table.length; row++) {
        // table[row] is a 1d array; a whole row of the table
        // the length of that 1d array is the number of columns in the table
        // int[] rowArray = table[row];
        // for (int col = 0; col < rowArray.length; col++) {
        for (int col = 0; col < table[row].length; col++) {
            IO.print(table[row][col] + "\t");
        }
        IO.println();
    }
}
