//Local inner class

class outer{
    void display(){
        class Inner{
            void innerdisplay(){
                System.out.println("Inner Display");
            }
        }
        Inner i=new Inner();
        i.innerdisplay();
    }
}
public class Main{
    public static void main(String[]args){
        outer o=new outer();
        o.display();
    }
}