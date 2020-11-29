import java.math.BigInteger;
public class JC2413 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(factorial(x));
    }
    public static BigInteger factorial(int value) {
        BigInteger result =  BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

//import java.math.BigInteger;
//public class JC2413 {
//    public static void main(String[] args) {
//        int x = 3;
//        System.out.println(factorial(x));
//    }
//    public static BigInteger factorial(int value) {
//        BigInteger bigvalue = BigInteger.valueOf(value);
//        BigInteger result =  BigInteger.ONE;
//
//        for (BigInteger i = BigInteger.ONE; i.compareTo(bigvalue) <= 0; i = i.add(i) ) {
//            result = result.multiply(i);
//        }
//        return result;
//    }
//}
