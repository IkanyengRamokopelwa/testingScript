import java.math.BigInteger;
import java.util.stream.IntStream;

public class firstDecle
{
     public static BigInteger sumOneToMillion() {
        return IntStream.rangeClosed(1, 1_000_000)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
    public static void main(String[] args) 
    {

    System.out.println(sumOneToMillion());
}


}