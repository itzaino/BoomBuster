package types;

public class Field {
    public boolean open;
    public boolean mine;
    public boolean flag;
    public int number;
    public String colour;
    //Field[] neighbours;???

    public Field (){
        open =false;
        mine=false;
        flag=false;
        number=0;
        colour=BackgroundColour.green;
    }
    public void setMine(){
        mine=true;
    }
    public boolean setFlag(){
        boolean error;
        if(!open){
            flag= !flag;
            error=false;
        } else{
            error=true;
        }
        return error;
    }
    public boolean openField(){
        boolean error;
        if(!flag&&!open){
            open = true;
            colour=BackgroundColour.yellow;
            error = false;
        } else{
            error=true;
        }
        return error;
    }
}
