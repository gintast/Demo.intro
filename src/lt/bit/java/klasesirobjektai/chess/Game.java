package lt.bit.java.klasesirobjektai.chess;

public class Game {
    public static void main(String[]args) {
        Queen queen = new Queen('D' ,8,"Black");
         King king  = new King ( 'E', 8, "Black");

         System.out.println(queen);
         System.out.println(king);

     //   queen.color ="Black";
     //   queen.letter = 'D';
     //   queen.number = 1;
    }

}
