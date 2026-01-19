import java.math.BigInteger;
import java.util.stream.IntStream;

public class secondDecl 
{

    public static BigInteger sumRange(int a, int b) 
    {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
    public static void main(String[] args) {
        System.out.println(sumRange(4,8));
    }
}