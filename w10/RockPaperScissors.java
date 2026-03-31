// choice is an integer, use the outcomes array when displaying it to the user
// 0 = rock, 1 = paper, 2 = scissors
String[] choices = new String[] { "rock", "paper", "scissors" };

// outcome is an integer, use the outcomes array when displaying it to the user
// 0 = win, 1 = lose, 2 = draw
String[] outcomes = new String[] { "win", "lose", "draw" };

// program: main function
void main() {
    boolean again = true;
    while (again) {
        // play a game
        playGame();
        // ask whether to play again
        String answer = IO.readln("Play again? yes/no\n");
        // repeat if yes
        again = answer.equalsIgnoreCase("yes");
    }
    IO.println("Goodbye");
}

// play a game: playGame
void playGame() {
    // play a round
    // if draw, repeat
    // if win/lose, return
    int outcome = playRound();
    while (outcome == 2) {
        IO.println("Result: " + outcomes[outcome]);
        outcome = playRound();
    }
    IO.println("Result: " + outcomes[outcome]);

    // version that avoids the repetition with a default DRAW outcome
    // int outcome = 2;
    // while (outcome == 2) {
    //     outcome = playRound();
    //     IO.println("Result: " + outcomes[outcome]);
    // }

    // we can also use a do-while loop for something slightly cleaner; no
    // default outcome needed
    // int outcome;
    // do {
    //     outcome = playRound();
    //     IO.println("Result: " + outcomes[outcome]);
    // } while (outcome == 2);
}

// play a round: playRound
// - playGame needs to know the outcome, so we return an int for outcome
int playRound() {
    // ask for user choice
    int user = userChoice();
    // get computer choice
    int comp = compChoice();
    // determine outcome
    int outcome = getOutcome(user, comp);
    // return outcome
    return outcome;
}

// ask for user choice: userChoice
// - playRound needs to know the choice, so we return an int for choice
int userChoice() {
    // ask to choose 0, 1, or 2 for rock, paper, or scissors
    // repeat if another number chosen
    // return number
    IO.println("Choose rock, paper, or scissors.");
    String option = IO.readln();
    int choice = 1;
    if (option.equals("rock")) {
        choice = 0;
    } else if (option.equals("paper")) {
        choice = 1;
    } else if (option.equals("scissors")) {
        choice = 2;
    }
    return choice;
}

int userChoice2() {
    String option = IO.readln("Choose rock, paper, or scissors. ");
    if (option.equals("rock")) {
        return 0;
    } else if (option.equals("paper")) {
        return 1;
    } else {
        return 2;
    }
}

int userChoice3() {
    while (true) {
        String userResponse = IO.readln("Please input rock, paper, or scissors");
        if (userResponse.equalsIgnoreCase("rock")) {
            return 0;
        } else if (userResponse.equalsIgnoreCase("paper")) {
            return 1;
        } else if (userResponse.equalsIgnoreCase("scissors")) {
            return 2;
        } else {
            IO.println("error message");
        }
    }
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
    if (player == computer) {
        return 2;
    } else if (player == 0 && computer == 1) {
        return 1;
    } else if (player == 1 && computer == 2) {
        return 1;
    } else if (player == 2 && computer == 0) {
        return 1;
    } else {
        return 0;
    }
}
