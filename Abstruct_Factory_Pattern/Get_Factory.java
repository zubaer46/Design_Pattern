package Abstruct_Factory_Pattern;

public class Get_Factory {
    public static Abstract_Factory getFactory(boolean bol){
        if(bol==false)
            return new Factory();
        else
            return new Modified_Factory();


    }
}
