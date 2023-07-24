import types.Field;
import types.Level;

/*
Aufgaben:
Assign Numbers --> See Think & Field
Game Over & Win Screen

Questions:
Should neighbours be an attribute of Field?
*/
public class Main {
   static Field[][] board=new Field[8][8];
    static Level[] levels= {
            new Level("Beginner",'B',8,10),
            new Level("Intermediate",'I',16,40),
            new Level("Expert",'E',22,99)
    };

    public static int openedFields=0;
    public static boolean start=false;
    static Level level;
    public static void main(String[] args) {
        //Draw.gameOverDraw();

        Draw.startPrompt();
        Think.gameInitiation();

         tests:
        board[1][3].setFlag();
        board[3][0].setFlag();
        board[0][1].openField();
        board[0][1].number=3;

        Draw.drawBoard(board);
        while(true){
            Utils.readField();
            Draw.drawBoard(board);
        }
    }
}