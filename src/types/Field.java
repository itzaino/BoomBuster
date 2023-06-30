package types;

public class Field {
    boolean open;
    boolean mine;
    boolean flag;

    public Field (){
        open =false;
        mine=false;
        flag=false;
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
        if(!open){
            open=true;
            error=false;
        } else{
            error=true;
        }
        return error;
    }
}
