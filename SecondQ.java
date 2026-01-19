import java.util.Scanner;

public class SecondQ
{   
public static int Max;
public static int Min;

public static boolean range(int x)
    {
        return x >= Min && x<= Max;
    }

public static void SecondFunc(int a, int b)
    {
        int sum = a+b;
        if(range(a) && range(b))
        {
          System.out.println(sum);
        }else 
        {
            System.out.println("Not in range");
        }

    }

 public static void EvenFunc(int a, int b)
    {   

        if(!range(a) || !range(b))
        {
            System.out.println("The range is invaid");
            return;
        }
        int sum = a+b;
        if(range(a) && range(b) && (a%2==0) && (b%2==0))
        {
          System.out.println(sum);
        }else 
        {
            System.out.println("The numbers are not odd");
        }

    }

        // public static Map<String, BigInteger> Mod3Squares(int a, int b) {
        // Map<String, BigInteger> results = new HashMap<>();
        
      
        // results.put("0 mod 3", BigInteger.ZERO);
        // results.put("1 mod 3", BigInteger.ZERO);
        // results.put("2 mod 3", BigInteger.ZERO);

        // int start = Math.min(a, b);
        // int end = Math.max(a, b);

        // for (int i = start; i <= end; i++) {
            
        //     int remainder = i % 3;
        //     if (remainder < 0) remainder += 3; 
            
        //     String key = remainder + " mod 3";

          
        //     BigInteger bigI = BigInteger.valueOf(i);
        //     BigInteger squared = bigI.pow(2); 

           
        //     results.put(key, results.get(key).add(squared));
        // }
        // return results;


public static void main(String[] args)
         {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter Min value");
            Min= scan.nextInt();

            System.out.println("Please Enter Max Value");
            Max = scan.nextInt();

           System.out.print("Answer is:");
          // SecondFunc(2,6);
            EvenFunc(2, 8);


        
        }

}





