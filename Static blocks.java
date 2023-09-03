//Static blocks

class block{
    static{
        System.out.println("Blocktest-1");//3rd executed
    }
    static{
        System.out.println("Blocktest-2");//4th executed
    }
}
public class Main{
    static{
        System.out.println("Block-1");//1st executed
    }
    public static void main(String[]args){
        block b=new block();
        System.out.println("Main");//lastly executed
    }
    static{
        System.out.println("Block-2");//2nd executed
    }
}