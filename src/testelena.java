import java.math.BigInteger;
public class testelena {
    public static void main(String[] args) {
        System.out.println(factorial(12));
    }
    public static BigInteger factorial(int value) {
        BigInteger fact=BigInteger.valueOf(1);
        if(value == 1 || value == 0) {
            return fact;
        }
        BigInteger value1= BigInteger.valueOf(value);
        fact=value1.multiply(factorial(value-1));
        return fact;
    }
}

