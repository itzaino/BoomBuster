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
        colour=BackgroundColour.green;
    }
    public boolean setFlag(){
        boolean error;
        if(!open){
            flag= !flag;
            error=false;
        } else{
            System.out.println(TextColour.red+"The field is open!!!"+TextColour.reset);
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
        } else if(flag){
            System.out.println(TextColour.red+"Theres a flag!!!"+TextColour.reset);
            error=true;
        }else {
            System.out.println(TextColour.red+"The field is already open!!!"+TextColour.reset);
            error=true;
        }
        return error;
    }
}
