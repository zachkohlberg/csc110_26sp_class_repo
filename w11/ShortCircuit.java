void main() {
    IO.println("yes() && no() -> " + (yes() && no()));
    IO.println();
    IO.println("no() && yes() -> " + (no() && yes()));
    IO.println();
    IO.println("no() || yes() -> " + (no() || yes()));
    IO.println();
    IO.println("yes() || no() -> " + (yes() || no()));
}

boolean yes() {
    IO.println("called yes()");
    return true;
}

boolean no() {
    IO.println("called no()");
    return false;
}
