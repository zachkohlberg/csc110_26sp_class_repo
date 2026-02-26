// file: Count.java

// demonstrates a simple "counting loop"
// - initialization happens before loop, creates a variable to track progress
// - condition checks whether the counter variable from init has reached the
//   target count
// - update increments the counter variable; normally the last statement in
//   loop's body
// - task(s): whatever code we're repeating
void main() {
    // initialization: counter variable
    int i = 0;
    // condition: repeat 10 times
    while (i < 10) {
        // task: print current repetition count
        IO.println(i);

        // update: increment counter variable
        i = i + 1;
    }
}

// practice exercises:
// - from 1 to 10 instead of 0 to 9
// - how many other ways can you make the loop count from 1 to 10?
// - which of these is the "best" way?
// - count down instead of up
// - print only even numbers (count up by 2 instead of 1)

