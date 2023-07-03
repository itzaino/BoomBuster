import types.BackgroundColour;
import types.Field;

public class Draw {
    public static void drawBoard(Field[][] board){
        for(Field[] row : board){
            for(int i=0;i<board.length*12;i++){
                System.out.print("-");
            }
            System.out.println("-");
            for(int j=0;j<3;j++){
                System.out.print("|");
                for(Field field : row){
                    System.out.print(field.colour+"    "+BackgroundColour.reset);
                    if(j==1){
                        //!Missing Number!
                        if(field.flag){
                            System.out.print(BackgroundColour.red+"   "+BackgroundColour.reset);
                        } else {
                            System.out.print(field.colour+"   "+BackgroundColour.reset);
                        }
                    }else{
                        System.out.print(field.colour+"   "+BackgroundColour.reset);
                    }
                    System.out.print(field.colour+"    "+BackgroundColour.reset);
                    System.out.print("|");
                }
                System.out.println();
            }
        }
        for(int i=0;i<board.length*12;i++){
            System.out.print("-");
        }
        System.out.println("-");
    }
}
