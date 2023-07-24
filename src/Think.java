import types.Field;
import java.util.Random;
import java.util.Arrays;

public class Think {
    public static void gameInitiation() {
        Main.board = new Field[Main.level.fieldSize][Main.level.fieldSize];
        for (Field[] row : Main.board) {
            Arrays.setAll(row, i -> new Field());
        }
        mineRandomiser();
        NumberOnField();
    }

    public static void mineRandomiser() {
        Random random = new Random();
        while (Main.level.minesAmount > 0) {
            Field field = Main.board[random.nextInt(Main.level.fieldSize)][random.nextInt(Main.level.fieldSize)];
            if (!(field.mine)) {
                field.mine = true;
                Main.level.minesAmount--;
            }
        }
    }
    public static void gameLoop(){
        Draw.drawBoard(Main.board);
    }
    public static void NumberOnField(){
        int x = 0;
        int y = 0;
        int counter = 0;
        for (x = 0; x < Main.level.fieldSize; x++){
            for ( y = 0; y < Main.level.fieldSize; y++){
                if (x > 0 && y > 0) {
                    if (Main.board[x - 1][y - 1].mine == true){
                        counter = counter + 1;
                    }
                }
                if (x > 0){
                    if (Main.board[x - 1][y].mine == true){
                        counter = counter + 1;
                    }

                }
                if (x > 0 && y + 1 < Main.level.fieldSize){
                    if (Main.board[x - 1][y + 1].mine == true){
                        counter = counter + 1;
                    }
                }
                if (y > 0){
                    if (Main.board[x][y - 1].mine == true) {
                            counter = counter + 1;
                    }
                }
                if (x + 1 < Main.level.fieldSize){
                    if (Main.board[x+1][y].mine == true){
                        counter = counter + 1;
                    }
                }
                if (y + 1 < Main.level.fieldSize){
                    if (Main.board[x][y + 1].mine == true) {
                        counter = counter + 1;
                    }
                }
                if (x + 1  < Main.level.fieldSize && y + 1 < Main.level.fieldSize){
                    if (Main.board[x + 1][y + 1].mine == true) {
                        counter = counter + 1;
                    }
                }
                if (x + 1 < Main.level.fieldSize && y > 0){
                    if (Main.board[x+1][y-1].mine == true){
                        counter = counter +1;
                    }
                }
                Main.board[x][y].number=counter;
                counter = 0;
            }
        }

    }
}