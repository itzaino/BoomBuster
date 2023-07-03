import types.Field;
import types.Level;

import java.util.Arrays;
import java.util.Objects;
/*
Aufgaben:

Bis Freitag:
Vinzent, Adrian
Read Methode
random Mines Methode

Loop through neighbours methode

Ainoa:
Start Prompt & Game Initiation & Draw fixen
 */
public class Main {
   static Field[][] board; //=new Field[8][8];
    static Level[] levels= {
            new Level("Beginner",'B',8,10),
            new Level("Intermediate",'I',16,40),
            new Level("Expert",'E',22,99)
    };
    public static boolean start=false;

    static Level level;
    public static void startPrompt(){
        System.out.println("Do you want to start a game?");
        System.out.println("Yes: Y");
        System.out.println("No: N");
        if(Objects.equals(Utils.readString(), "Y")){
            System.out.println("How good are you?");
            for (Level levelL : levels) {
                System.out.println(levelL.name + ": " + levelL.letter);
            }
            start= true;
        }else if(Objects.equals(Utils.readString(), "N")){
            System.out.println("Okay, if you want to start press Y");
        } else {
            System.out.println("da fuq?");
        }
    }
    public static void main(String[] args) {
        //Dummy Data
        for(Field[] row:board){
            //!Reference Error!
            Arrays.fill(row,new Field());
        }

        //testing

        board[1][3].setFlag();
        board[3][0].setFlag();
        board[3][0].openField();
        board[0][1].openField();

        for(Field[] row:board){
            for(Field field:row){
                System.out.print(field.open + " ");
            }
            System.out.println();
        }

        Draw.drawBoard(board);
    }
}