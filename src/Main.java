import types.Field;
import types.Level;

import java.util.ArrayList;

public class Main {
   Field[][] board;
    static ArrayList<Level> levels=new ArrayList<>();
    static boolean start=false;
    public static void startPrompt(){
        start=false;
        System.out.println("Do you want to start a game?");
        System.out.println("Yes: Y");
        System.out.println("No: N");
        if(Utils.readString()=="Y"){
            System.out.println("How good are you?");
            for(int i=0;i<levels.size();i++){
                System.out.println(levels.get(i).name+": "+levels.get(i).letter);
            }
            start= true;
        }else if(Utils.readString()=="N"){
            System.out.println("Okay, if you want to start press Y");
        } else {
            System.out.println("da fuq?");
        }
    }
    public static void main(String[] args) {
        while(!start){
            startPrompt();
        }

    }
}