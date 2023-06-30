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
                    if(field.open){
                        System.out.print(BackgroundColour.yellow+"    "+BackgroundColour.reset);
                    }else {
                        System.out.print(BackgroundColour.green+"    "+BackgroundColour.reset);
                    }
                    //here if-Statement
                    if(j==1){
                        if(field.flag){
                            System.out.print(BackgroundColour.red+"   "+BackgroundColour.reset);
                        } else if (field.open) {
                            System.out.print(BackgroundColour.yellow+"   "+BackgroundColour.reset);
                        }else {
                            System.out.print(BackgroundColour.green+"   "+BackgroundColour.reset);
                        }
                    }else{
                        if(field.open){
                            System.out.print(BackgroundColour.yellow+"   "+BackgroundColour.reset);
                        }else {
                            System.out.print(BackgroundColour.green+"   "+BackgroundColour.reset);
                        }
                    }
                    //end if-Statement
                    if(field.open){
                        System.out.print(BackgroundColour.yellow+"    "+BackgroundColour.reset);
                    }else {
                        System.out.print(BackgroundColour.green+"    "+BackgroundColour.reset);
                    }
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
