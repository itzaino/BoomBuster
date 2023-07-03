import types.Field;
import types.Level;

public class Think {
    public static void gameInitiation(String levelC){
        for (Level levelL : Main.levels) {
            if(levelC.charAt(0)==levelL.letter){
                Main.level=levelL;
            }
        }
        Main.board=new Field[Main.level.fieldSize][Main.level.fieldSize];
    }
}

//Method: Random Mine Generation
