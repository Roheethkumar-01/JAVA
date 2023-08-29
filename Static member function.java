//Static member function

class Pow{
    public static int power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result=result*a;
        }
        return result;
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println(Pow.power(2,3));
	}
}
