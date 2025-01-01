package SnakeNLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame() {

        board = new Board(10, 5,4);
        dice = new Dice(6);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", "Anupam",board.getCell(1));
        Player player2 = new Player("p2", "Victor",board.getCell(1));
        players.add(player1);
        players.add(player2);

    }
    public void startGame(){

        while(winner == null) {

            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentCell.cellNo);

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            Cell playerNewPosition = board.getCell(playerTurn.currentCell.cellNo + diceNumbers);
            playerNewPosition = board.getCell(jumpCheck(playerNewPosition.cellNo));
            playerTurn.currentCell = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition.cellNo);
            //check for winning condition
            if(playerNewPosition.cellNo >= board.cells.length * board.cells.length-1){

                winner = playerTurn;
            }

        }

        System.out.println("WINNER IS:" + winner.id);
    }


    private Player findPlayerTurn() {

        Player playerTurns = players.removeFirst();
        players.addLast(playerTurns);
        return playerTurns;
    }
    private int  jumpCheck (int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.snake != null && cell.snake.start == playerNewPosition) {
            String jumpBy = (cell.snake.start < cell.snake.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.snake.end;
        }
        if(cell.ladder != null && cell.ladder.start == playerNewPosition) {
            String jumpBy = (cell.ladder.start < cell.ladder.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.ladder.end;
        }
        return playerNewPosition;
    }
}
