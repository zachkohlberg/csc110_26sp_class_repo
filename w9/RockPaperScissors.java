// choice is an integer, use the outcomes array when displaying it to the user
// 0 = rock, 1 = paper, 2 = scissors
String[] choices = new String[] { "rock", "paper", "scissors" };

// outcome is an integer, use the outcomes array when displaying it to the user
// 0 = win, 1 = lose, 2 = draw
String[] outcomes = new String[] { "win", "lose", "draw" };

// program: main function
void main() {
    // play a game
    // ask whether to play again
    // repeat if yes
}

// play a game: playGame
void playGame() {
    // play a round
    // if draw, repeat
    // if win/lose, return
}

// play a round: playRound
// - playGame needs to know the outcome, so we return an int for outcome
int playRound() {
    // ask for user choice
    // get computer choice
    // determine outcome
    // return outcome
}

// ask for user choice: userChoice
// - playRound needs to know the choice, so we return an int for choice
int userChoice() {
    // ask to choose 0, 1, or 2 for rock, paper, or scissors
    // repeat if another number chosen
    // return number
}

// get computer choice: compChoice
// - playRound needs to know the choice, so we return an int for choice
int compChoice() {
    // return a random number from 0 to 2
    seed = (seed * 9301 + 47297) % 233280;
    return seed * 3 / 233280;
}
int seed = (int)(System.currentTimeMillis() % 233280);

// determine outcome: getOutcome
// - needs to know player and computer choices, so we include int parameters
// - playRound needs to know the outcome, so we return an int for outcome
int getOutcome(int player, int computer) {
    // equal             -> draw
    // rock vs paper     -> lose
    // paper vs scissors -> lose
    // scissors vs rock  -> lose
    // other             -> win
}
