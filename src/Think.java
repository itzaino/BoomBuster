import types.Field;
import types.Level;

import java.util.Arrays;

public class Think {
    public static void gameInitiation(String levelC){
        for (Level levelL : Main.levels) {
            if(levelC.charAt(0)==levelL.letter){
                Main.level=levelL;
            }
        }
        Main.board=new Field[Main.level.fieldSize][Main.level.fieldSize];
        for(Field[] row:Main.board){
            Arrays.setAll(row, i->new Field());
        }
    }
}

//Method: Random Mine Generation
