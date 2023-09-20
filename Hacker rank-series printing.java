//Hacker rank-Series printing

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt(); // Number of queries
        
        // Create arrays to store a, b, and n for all queries
        int[] aValues = new int[queries];
        int[] bValues = new int[queries];
        int[] nValues = new int[queries];
        
        // Read input values for all queries
        for (int i = 0; i < queries; i++) {
            aValues[i] = scanner.nextInt();
            bValues[i] = scanner.nextInt();
            nValues[i] = scanner.nextInt();
        }
        
        // Process and print the series for each query
        for (int i = 0; i < queries; i++) {
            int a = aValues[i];
            int b = bValues[i];
            int n = nValues[i];
            
            int result = a; // Initialize the result with 'a'

            // Generate and print the series
            for (int j = 0; j < n; j++) {
                result += (int) Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            
            System.out.println(); // Move to the next line for the next query
        }
        
        scanner.close();
    }
}
