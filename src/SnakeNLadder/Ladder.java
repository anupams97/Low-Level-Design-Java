package SnakeNLadder;

public class Ladder {
    int start;
    int end;
    Ladder(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Ladder start must be less than or equal to end");
        }
        this.start = start;
        this.end = end;
    }
}
