import types.Field;
import types.Level;

import java.util.Objects;

public class Main {
   Field[][] board;
    static Level[] levels= {
            new Level("Beginner",'B',8,10),
            new Level("Intermediate",'I',16,40),
            new Level("Expert",'E',22,99)
    };
    static boolean start=false;
    public static void startPrompt(){
        start=false;
        System.out.println("Do you want to start a game?");
        System.out.println("Yes: Y");
        System.out.println("No: N");
        if(Objects.equals(Utils.readString(), "Y")){
            System.out.println("How good are you?");
            for (Level level : levels) {
                System.out.println(level.name + ": " + level.letter);
            }
            start= true;
        }else if(Objects.equals(Utils.readString(), "N")){
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