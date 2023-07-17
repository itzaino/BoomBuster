import types.BackgroundColour;
import types.Field;
import types.Level;
import types.TextColour;

import java.util.Objects;

public class Draw {
    public static void startPrompt(){
        while(!Main.start){
            System.out.println("Do you want to start the game?");
            System.out.println("Yes: Y");
            System.out.println("No: N");
            String input=Utils.readString();
            if(input.equalsIgnoreCase("y")){
                while(!Main.start){
                    System.out.println("How good are you?");
                    for (Level levelL : Main.levels) {
                        System.out.println(levelL.name + ": " + levelL.letter);
                    }
                    String text=Utils.readString();
                    for (Level levelL : Main.levels) {
                        if (text.equalsIgnoreCase(String.valueOf(levelL.letter))) {
                            Main.level=levelL;
                            Main.start= true;
                        }
                    }
                    if(!Main.start){
                        System.out.print("Please clarify... ");
                    }
                }

            }else if(input.equalsIgnoreCase("n")){
                System.out.print("But... ");
            } else {
                System.out.println("da fuq?");
            }
        }
    }
    public static void drawBoard(Field[][] board){
        for(int i=0;i<board.length;i++){
            int f=65+i;
            System.out.print("     "+Character.toString(f)+"      ");
        }
        System.out.println();
        int j=0;
        for(Field[] row : board){
            j++;
            System.out.print(" ");
            for(int i=0;i<board.length*12;i++){
                System.out.print("-");
            }
            System.out.println("-");
            for(int i=0;i<3;i++){
                if(i==1){
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
                System.out.print("|");
                for(Field field : row){
                    System.out.print(field.colour+"    "+BackgroundColour.reset);
                    if(i==1){
                        //!Missing Number!
                        if(field.flag){
                            System.out.print(BackgroundColour.red+"   "+BackgroundColour.reset);
                        } else if(field.open){
                            System.out.print(field.colour+TextColour.black+" "+field.number+" "+TextColour.reset+BackgroundColour.reset);
                        }else {
                            System.out.print(field.colour+"   "+BackgroundColour.reset);
                        }
                    }else{
                        System.out.print(field.colour+"   "+BackgroundColour.reset);
                    }
                    System.out.print(field.colour+"    "+BackgroundColour.reset);
                    System.out.print("|");
                }
                System.out.println();
            }
        }
        System.out.print(" ");
        for(int i=0;i<board.length*12;i++){
            System.out.print("-");
        }
        System.out.println("-");
    }
    public static void gameOverDraw(){

    }
}
