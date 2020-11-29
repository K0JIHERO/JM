import java.math.BigInteger;
public class JC2414 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(factorial(x));
    }
    public static BigInteger factorial(int value) {
        BigInteger result =  BigInteger.valueOf(1);
        if (value == 1 || value == 0){
            return result;
        }
        result = factorial(value-1).multiply(BigInteger.valueOf(value));
        return result;
    }
}