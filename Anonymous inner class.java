//Anonymous inner class

//both abstract and interface can be used

abstract class test{
    abstract void display();
}
class outer{
    public void outerdisplay(){
        test o=new test(){
            public void display(){
                System.out.println("Test display");
            }
        };
        o.display();
    }
}
public class Main{
    public static void main(String[]args){
        outer o=new outer();
        o.outerdisplay();
    }
}