import java.util.Arrays;

public class JC2416 {
    public static void main(String[] args) {
        JC2416 clas = new JC2416();
        System.out.println(Arrays.toString(evenArray(7)));
    }
    public static int[] evenArray(int number) {
        number = Math.abs(number);
        int[] result = new int[number/2];
        for (int i = 1; i <= result.length; i++){
            result[i-1] = i*2;
        }
        return result;
    }
}


