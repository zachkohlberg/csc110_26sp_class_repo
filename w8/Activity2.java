void main() {
    float a = 0f;

    int i = 0;
    while (i < 10_000_000) {
        a = a + 0.01f;
        i = i + 1;
    }

    IO.println(a);
}
// Guesses?
// - 100,000.0
// - 87,379.0
// - 99,999.0
// - 0.1
// - 90,000.0
//
// Nope, it's 95,680.945
// because of rounding errors with float, we're off by
// about 4.3%
