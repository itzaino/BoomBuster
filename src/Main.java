import types.Field;
import types.Level;

import java.util.Arrays;
import java.util.Objects;
/*
Aufgaben:

Bis Freitag:
Vinzent, Adrian:
Read Methode --> See Utils
Mine Randomisation --> See Think

Loop through neighbours methode --> See Think & Field

Ainoa:
Check Field-Classes & consider Errors

Missing:
Drawing Numbers

Questions:
Where should startPrompt() be?
Should neighbours be an attribute of Field?

*/
public class Main {
   static Field[][] board=new Field[8][8];
    static Level[] levels= {
            new Level("Beginner",'B',8,10),
            new Level("Intermediate",'I',16,40),
            new Level("Expert",'E',22,99)
    };
    public static boolean start=false;

    static Level level;
    public static String startPrompt(){
        String levelC="";
        while(!start){
            System.out.println("Do you want to start the game?");
            System.out.println("Yes: Y");
            System.out.println("No: N");
            if(Objects.equals(Utils.readString(), "Y")){
                System.out.println("How good are you?");
                for (Level levelL : levels) {
                    System.out.println(levelL.name + ": " + levelL.letter);
                }
                levelC=Utils.readString();
                start= true;
            }else if(Objects.equals(Utils.readString(), "N")){
                System.out.print("But... ");
            } else {
                System.out.println("da fuq?");
            }
        }
        return levelC;
    }
    public static void main(String[] args) {
        //startPrompt(); //--> move to Think/Draw?
        Think.gameInitiation("B");

        //testing
        board[1][3].setFlag();
        board[3][0].setFlag();
        board[0][1].openField();

        Draw.drawBoard(board);
    }
}