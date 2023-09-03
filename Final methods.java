//Final methods 

class Super{
    void display(){
        System.out.println("I am Super display");
    }
    final void final_display(){
        System.out.println("I am Final Super display");
    }
}
class sub extends Super{
    void display(){
        System.out.println("I am Sub display");
    }
    //Final method cannot be override.
}
public class Main{
    public static void main(String[]args){
        sub o=new sub();
        o.display();
        Super s=new Super();
        s.final_display();
    }
}
