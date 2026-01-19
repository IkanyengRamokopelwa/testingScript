import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FifthQ 
{

    public static Map<String, Integer> modThree(int a, int b)
    {
        int rem0 = 0;
        int rem1 = 0;
        int rem2 = 0;

        int start = Math.min(a, b);
        int End = Math.max(a, b);

        for(int i = start; i < End; i++)
        {
            if(i%3==0)
            {
                rem0 += i;
            }else if(i%3 ==1)
            {
                rem1 += i;

            }else
            {
                rem2 += i;
            }
        }

        Map<String,Integer> output = new HashMap<>();
        output.put("0 mod 3", rem0);
        output.put("1 mod 3", rem1);
        output.put("2 mod 3", rem2);

        return output;

    }
    
    public static void main(String[] args) 
    {   
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter Min");
        int start = scan.nextInt();

        
        System.out.println("Please enter Max");
        int end = scan.nextInt();

        Map<String,Integer> sum = modThree(start,end);
        System.out.println("0: " + sum.get("0 mod 3"));
        System.out.println("1: " + sum.get("1 mod 3"));
        System.out.println("2: " + sum.get("2 mod 3"));
        
    }
}
