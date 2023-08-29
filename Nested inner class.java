//Nested inner class

class outer{
    int A=50;
    class inner{
        int B=100;
        void innerdisplay(){
            System.out.println(A);
        }
    }
    void outerdisplay(){
        inner i=new inner();
        i.innerdisplay();
        System.out.println(i.B);
    }
}
public class Main{
    public static void main(String[]args){
        outer o=new outer();
        o.outerdisplay();
        outer.inner oi=new outer().new inner();
        oi.innerdisplay();
    }
}