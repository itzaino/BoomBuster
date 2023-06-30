package types;

import java.awt.font.TextHitInfo;

public class Level {
    public String name;
    public char letter;
    public int fieldSize;
    public int minesAmount;

    public Level(String name, char letter, int fieldSize, int minesAmount){
        this.name=name;
        this.letter=letter;
        this.fieldSize=fieldSize;
        this.minesAmount=minesAmount;
    }
}
