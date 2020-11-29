public class JC2282 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        int result = 1;
        for (int i = 1; result < value; i++) {
            result = result * 2;
            if (result == value) {
                return true;
            }
        }
        return false;
    }
}
