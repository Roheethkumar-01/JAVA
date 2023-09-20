//ID generation: abdc->dc
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = s.charAt(0);
        int j = 0;

        for (int i = 1; i < s.length(); i++) {
            if (c < s.charAt(i)) {
                j = i;
                c = s.charAt(i);
            }
        }
        System.out.println(s.substring(j));
    }
}
