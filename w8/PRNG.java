void main() {
    IO.println(random());
    IO.println(random());
    IO.println(random());
    IO.println(random());
    IO.println(random());
}

// declare seed outside function so it's not reset every time we call random()
// usually not good to make "global" variables like this, but it's necessary for
// our prng function
int seed = (int)(System.currentTimeMillis() % 233280);
double random() {
    seed = (seed * 9301 + 47297) % 233280;
    return seed / 233280.0;
}

