import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class ForthQ
{

    public static Map<String, Integer> sumOfNums(int a, int b)
    {
        int even =0;
        int odd =0;

        int startPoint = Math.min(a,b);
        int endPoint = Math.max(a,b);

        for(int i = startPoint; i < endPoint; i++)
        {
            if(i%2==0)
            {
                even += i;  
            }else
            {
                odd += i;
            }
        }

        Map<String,Integer> output = new HashMap<>();
        output.put("Even", even);
        output.put("Odd",odd);

        return output;
        
    }
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter Min");
        int start = scan.nextInt();

        
        System.out.println("Please enter Max");
        int end = scan.nextInt();




        Map<String,Integer> sum = sumOfNums(start,end);
        System.out.println("Even " + sum.get("Even"));
        System.out.println("Odd " + sum.get("Odd"));
    }
}