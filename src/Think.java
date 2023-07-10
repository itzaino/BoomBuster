import types.Field;
import types.Level;
import java.util.Random;
import java.util.Arrays;

public class Think {
    public static void gameInitiation(String levelC) {
        for (Level levelL : Main.levels) {
            if (levelC.charAt(0) == levelL.letter) {
                Main.level = levelL;
            }
        }
        Main.board = new Field[Main.level.fieldSize][Main.level.fieldSize];
        for (Field[] row : Main.board) {
            Arrays.setAll(row, i -> new Field());
        }
        //Mine Randomisation --> see bottom, call here
        //Mine Counter --> loop here, function in Field
    }

    public static void mineRandomiser() {
        Random random = new Random();
        while (Level.minesAmount > 0) {
            Field Field = Main.board[random.nextInt(Main.level.fieldSize)][random.nextInt(Main.level.fieldSize)];
            if (!(Field.mine)) {
                Field.mine = true;
                Level.minesAmount--;
            }
        }
    }
}