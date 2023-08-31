//Static inner class

class outer{
    static int x=10;
    int y=20;
    static class inner{
        void display(){
            System.out.println("X: "+x);
            // System.out.println("Y: "+y); can't be accessed, its not static.
        }
    }
}
public class Main{
    public static void main(String[]args){
        outer.inner oi=new outer.inner();
        oi.display();
    }
}