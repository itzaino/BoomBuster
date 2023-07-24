import types.TextColour;

import java.util.Scanner;
public class Utils {
    static Scanner scanner = new Scanner(System.in);
    public static String readString(){
        /*
        Fenster öffnet sich und man kann reinschreiben bis ENTER gedrückt wird
        dann wird die Eingabe eingelesen
        ACHTUNG! nur für String verwendbar,
        wenn man int oder Double einlesen will, muss nextInt() bzw. nextDouble verwendet werden
         */
        return scanner.nextLine();
    }
    public static boolean readField(){
        boolean error=true;
        while(error){
            error=false;
            System.out.println("choose a Field (e.g.: A3) and an action (O/F)");
            System.out.println("e.g.: F5O (opens field A3)");
            System.out.println("e.g.: B6F (places a flag on field B6)");
            String input = readString();
            String[] inputA = input.split("(?!^)");
            if(inputA.length==3){
                int y=-1;
                int x=-1;
                try{
                    if(Integer.parseInt(inputA[1])<=Main.board.length){
                        x=Integer.parseInt(inputA[1])-1;
                    }
                }catch (Exception e){
                    error=true;
                }
                if((int)inputA[0].charAt(0)<=Main.board.length+65&&(int)inputA[0].charAt(0)>=65){
                    y=(int)inputA[0].charAt(0)-65;
                } else if ((int)inputA[0].charAt(0)>=97&&(int)inputA[0].charAt(0)<=Main.board.length+97) {
                    y=(int)inputA[0].charAt(0)-97;
                }
                if(y!=-1&&x!=-1){
                    if(inputA[2].equalsIgnoreCase("O")){
                        Main.board[x][y].openField();
                        if(Main.board[x][y].mine){
                            Main.openedFields = 0;
                            Draw.gameOverDraw();
                            Main.running=false;
                        } else if(!Main.board[x][y].flag){
                            Main.openedFields ++;
                        }
                    } else if (inputA[2].equalsIgnoreCase("F")) {
                        Main.board[x][y].setFlag();
                    }else{
                        error=true;
                    }
                }else{
                    error=true;
                }
                if(error){
                    System.out.print("learn how to type and... ");
                }
            }else {
                System.out.println(TextColour.red+"please correct your input"+TextColour.reset);
            }
            }

        return false;
    }

    public static void WinCondition() {
        if(((Main.level.fieldSize * Main.level.fieldSize)-Main.level.minesAmount)==Main.openedFields){
            Draw.winDraw();
            Main.running=false;
        }
    }
}
