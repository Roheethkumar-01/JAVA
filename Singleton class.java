//Singleton class

//Cannot create multiple objects at a time. It doesn't allow to create

class single{
    static single obj=null;
    private single(){}//create constructor with private key word
    public static single getInstance(){
        if(obj==null)
            obj=new single();
        return obj;
    }
    void display(){
        System.out.println("Display");
    }
    
}
public class Main{
    public static void main(String[]args){
            single s=single.getInstance();
            s.display();
    }
}