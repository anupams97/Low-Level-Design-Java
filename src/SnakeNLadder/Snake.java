package SnakeNLadder;

public class Snake {
    int start;
    int end;
    Snake(int start, int end) {
        if (start <= end){
            throw new IllegalArgumentException("Snake must have end less than start");
        }
        this.start = start;
        this.end = end;
    }
}
