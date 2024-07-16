import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main
{   public static boolean isValidPassword(String password){
        String regex="^(?=.*[0-9])"+
        "(?=.*[A-Z])"+"(?=.*[a-z])"+
        "(?=.*[!@#$%^&*()+=-])"+
        "(?=\\S+$).{8,20}$";
        Pattern p=Pattern.compile(regex);
        if(password==null){
            return false;
        }
        Matcher m=p.matcher(password);
        return m.matches();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(isValidPassword(str));
	}
}