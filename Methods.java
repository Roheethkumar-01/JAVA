//Methods

class Methods{
    //No return & No arguments
    public void addition(){
        int a=123;
        int b=123;
        System.out.println(a+b);
    }
    //No return & with arguments
    public void sub(int x,int y){
        System.out.println(x-y);
    }
    //return with no arguments
    public int mul(){
        int a=2;
        int b=3;
        return(a*b);
    }
    //return with arguments
    public float div(int x,int y){
        return(x/y);
    }
    //Recursive function
    public int fact(int n){
        if (n==1){
            return 1;
        }
        else{
            return(n*fact(n-1));
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Methods o=new Methods();
		o.addition();
		o.sub(12,5);
		System.out.println(o.mul());
		System.out.println(o.div(6,2));
		System.out.println(o.fact(5));
	}
}
