public class JC2282 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2048));
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        int result = 1;
        while (result < value) {
            result = result * 2;
            if (result == value) {
                return true;
            }
        }
        return false;
    }
}
