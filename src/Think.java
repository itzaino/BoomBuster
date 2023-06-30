import types.Field;
import types.Level;

import java.util.Objects;

public class Think {
    public static void gameInitiation(String levelC){
        for (Level levelL : Main.levels) {
            if(Objects.equals(levelC,levelL.letter)){
                Main.level=levelL;
            }
        }
        Main.board=new Field[Main.level.fieldSize][Main.level.fieldSize];
    }
}
