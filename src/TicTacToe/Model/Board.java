package TicTacToe.Model;

public class Board {
    int size;
    PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }
    public boolean addPiece(int x, int y, PlayingPiece piece) {
        if(board[x][y] == null) {
            return false;
        }
        board[x][y] = piece;
        return true;
    }

}
