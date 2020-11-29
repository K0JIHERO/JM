import java.math.BigInteger;
public class test24132 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(factorial(x));
    }
    public static BigInteger factorial(int value) {
        BigInteger result =  BigInteger.ONE;
        BigInteger iterator = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(iterator);
            iterator = iterator.add(BigInteger.ONE);
        }
        return result;
    }
}
