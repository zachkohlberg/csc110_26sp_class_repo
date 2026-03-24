// author: ME!

void main() {
    // the seed 123456 will produce the following sequence of die rolls:
    // 3, 1, 5, 2, 2,
    seed = 123456;

    // should print the first five values
    // 3
    // 1
    // 5
    // 2
    // 2
    IO.println(rollDie());
    IO.println(rollDie());
    IO.println(rollDie());
    IO.println(rollDie());
    IO.println(rollDie());
}

int seed = 1;
int rollDie() {
    seed = (seed * 9301 + 47297) % 233280;
    return (seed * 6 / 233280) + 1;
}
