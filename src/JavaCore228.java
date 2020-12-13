import java.util.Scanner;

public class JavaCore228 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2048));
    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}

