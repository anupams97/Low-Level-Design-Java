package TicTacToe.Model;

import java.lang.reflect.ParameterizedType;
import java.util.Deque;
import java.util.LinkedList;

public class Game {
    public Board gameboard;
    public Deque<Player> players;
    public Game() {
        initialiseGame();
    }
    public void initialiseGame() {
        //add players
        players = new LinkedList<>();
        PlayingPieceX cross = new PlayingPieceX();
        PlayingPieceO noughts = new PlayingPieceO();
        Player player1 = new Player("p1",cross);
        Player player2 = new Player("p2",noughts);
        players.add(player1);
        players.add(player2);

        //init board
        gameboard = new Board(3);

    }
    public String startGame() {
        boolean noWinner = true;

    return  "";
    }
}
