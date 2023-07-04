public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves(); // public and abstract by default
}
class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}