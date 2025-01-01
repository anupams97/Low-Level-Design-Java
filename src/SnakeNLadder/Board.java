package SnakeNLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    public Board(int size, int noOfSnakes, int noOfLadders) {
        initializeCells(size);
        addSnakesNLadders(cells,noOfSnakes,noOfLadders);


    }

    private void initializeCells(int size) {
        cells = new Cell[size][size];
        int lastCell = size * size; // Start from the highest number
        boolean isRightToLeft = false; // Tracks direction of numbering in the row


        for (int row = 0; row < size; row++) {
            if (isRightToLeft) {
                // Right to left
                for (int col = size - 1; col >= 0; col--) {
                    cells[row][col] = new Cell(lastCell--);
                }
            } else {
                // Left to right
                for (int col = 0; col < size; col++) {
                    cells[row][col] = new Cell(lastCell--);
                }
            }
            isRightToLeft = !isRightToLeft; // Toggle direction for next row
        }
    }
    private void addSnakesNLadders(Cell[][] cells, int noOfSnakes, int noOfLadders) {
        // create snakes
        while(noOfSnakes>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells[0].length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells[0].length-1);
            if (snakeHead<snakeTail){
                continue;
            }
            Snake snake = new Snake(snakeHead, snakeTail);
            Cell cell = getCell(snakeHead);
            cell.snake = snake;
            noOfSnakes--;
        }

        //create ladders
        while(noOfLadders>0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length*cells[0].length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length*cells[0].length-1);
            if (ladderEnd<ladderStart){
                continue;
            }
            Ladder ladder = new Ladder(ladderStart, ladderEnd);
            Cell cell = getCell(ladderStart);
            cell.ladder = ladder;
            noOfLadders--;
        }


    }
     Cell getCell(int cellNo) {
        int size = cells.length; // The board size (e.g., 10 for a 10x10 board)

        // Calculate the zero-based row index
        int row = (size * size - cellNo) / size;

        // Determine if the row is numbered left-to-right or right-to-left
        boolean isRightToLeft = (row % 2 == 1);

        // Calculate the zero-based column index
        int col;
        if (isRightToLeft) {
            col = size - 1 - ((cellNo - 1) % size);
        } else {
            col = (cellNo - 1) % size;
        }

        // Return the cell
        return cells[row][col];
    }
}
