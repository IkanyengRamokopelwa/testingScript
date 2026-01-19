public class Main
{

    public static final int Max= 1000000;
    public static final int Min = 1;

    public static boolean range(int x)
    {
        return x >= Min && x<= Max;
    }
    public static void firstFunc(int a, int b)
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
    public static void main(String[] Args)
    {
        firstFunc(6,4);
        System.out.println("Hello");
    }
}