import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SicthQ
{public static Map<String, Integer> calculateModSums(int a, int b, int n) {
        Map<String, Integer> results = new HashMap<>();

        if (n <= 0) {
            System.out.println("Error: Divisor must be greater than 0");
            return results;
        }

        for (int i = 0; i < n; i++) {
            results.put(i + " mod " + n, 0);
        }

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
  
            int remainder = i % n;

            if (remainder < 0) {
                remainder += n;
            }

            String key = remainder + " mod " + n;

            int currentSum = results.get(key);
            results.put(key, currentSum + i);
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Enter start: ");
        int a = scan.nextInt();

        System.out.print("Enter end: ");
        int b = scan.nextInt();

        System.out.print("Enter divisor: ");
        int n = scan.nextInt();

        Map<String, Integer> result = calculateModSums(a, b, n);


        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            String key = i + " mod " + n;
            System.out.println(key + ": " + result.get(key));
        }
    }
}