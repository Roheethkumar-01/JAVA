//Enumeration

//enum used to handle constant values

public class Main{
    enum Gamelevel{
        LOW,NORMAL,HIGH;
    }
    public static void main(String[]args){
        //Assign enum variable
        Gamelevel a=Gamelevel.HIGH;
        System.out.println(a);
        //use enum in switch
        switch(a){
            case LOW:
                System.out.println("LOW level");
                break;
            case NORMAL:
                System.out.println("NORMAL level");
                break;
            case HIGH:
                System.out.println("HIGH level");
                break;
        }
        //use enum in loop
        for(Gamelevel level:Gamelevel.values()){
                   System.out.println(level);
        }
    }
}