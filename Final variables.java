//Final variables
//once initialized, can't be changed.

class Test{
    final int MIN=1;
    final int NORMAL;
    final int MAX;
    Test(int normal){
        NORMAL=normal;
        MAX=100;
    }
    void display(){
        System.out.println(MIN);
        System.out.println(NORMAL);
        System.out.println(MAX);
    }
}
public class Main{
    public static void main(String[]args){
        Test t=new Test(50);
        t.display();
    }
}