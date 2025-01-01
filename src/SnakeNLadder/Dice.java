package SnakeNLadder;

import java.util.Random;

public class Dice {
    int diceSize;
    public Dice(int n) {
        this.diceSize = n;
    }

    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // Generates a random number between 1 and 6
    }
}
