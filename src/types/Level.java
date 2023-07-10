package types;

public class Level {
    public String name;
    public char letter;
    public int fieldSize;
    public static int minesAmount;

    public Level(String name, char letter, int fieldSize, int minesAmount){
        this.name=name;
        this.letter=letter;
        this.fieldSize=fieldSize;
        this.minesAmount=minesAmount;
    }
}
