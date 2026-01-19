import java.math.BigInteger;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeclarativeSums {

    // 1. Sum 1 to 1,000,000
    public static BigInteger sumOneToMillion() {
        return IntStream.rangeClosed(1, 1_000_000)
                .mapToObj(BigInteger::valueOf) // Convert int -> BigInteger stream
                .reduce(BigInteger.ZERO, BigInteger::add); // Reduce to single sum
    }

    // 2. Sum range a to b
    public static BigInteger sumRange(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    // 3. Sum EVEN numbers only (a to b)
    public static BigInteger sumEvens(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .filter(i -> i % 2 == 0)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    // 4. Sum Even vs Odd (Return Map)
    public static Map<String, BigInteger> sumEvenOddMap(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> (i % 2 == 0) ? "even" : "odd",
                        Collectors.mapping(
                                i -> BigInteger.valueOf(i), 
                                Collectors.reducing(BigInteger.ZERO, BigInteger::add)
                        )
                ));
    }

    // 5. Sum Modulo 3 (Return Map)
    public static Map<String, BigInteger> sumMod3Map(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> ((i % 3 + 3) % 3) + " mod 3",
                        Collectors.mapping(
                                i -> BigInteger.valueOf(i),
                                Collectors.reducing(BigInteger.ZERO, BigInteger::add)
                        )
                ));
    }

    // 6. Sum Modulo N (Return Map)
    public static Map<String, BigInteger> sumModNMap(int a, int b, int n) {
        if (n <= 0) return Map.of();

        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> ((i % n + n) % n) + " mod " + n,
                        Collectors.mapping(
                                i -> BigInteger.valueOf(i),
                                Collectors.reducing(BigInteger.ZERO, BigInteger::add)
                        )
                ));
    }



  
    public static void main(String[] args) {
        System.out.println("1. Sum 1-1M: " + sumOneToMillion());
        System.out.println("2. Sum 1-5: " + sumRange(1, 5));
        System.out.println("3. Sum Evens 1-5: " + sumEvens(1, 5));
        System.out.println("4. Map Even/Odd 1-5: " + sumEvenOddMap(1, 5));
        System.out.println("5. Map Mod 3 (1-5): " + sumMod3Map(1, 5));
        System.out.println("6. Map Mod 2 (1-5): " + sumModNMap(1, 5, 2));
    }
}