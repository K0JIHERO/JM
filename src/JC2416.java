import java.util.Arrays;

public class JC2416 {
    public static void main(String[] args) {
        JC2416 clas = new JC2416();
        System.out.println(Arrays.toString(evenArray(25)));
    }
    public static int[] evenArray(int number) {
        number = Math.abs(number);
        int[] result = new int[number/2];
        int iter = 0;
        for (int i = 1; i <= number; i++){
            if (i%2 == 0) {
                result[iter] = i;
                iter++;
            }
        }
        return result;
    }
}

//    public static int[] evenArray(int number) {
//        number = Math.abs(number);
//        int[] result = new int[number/2];
//        for (int i = 1; i <= result.length; i++){
//            result[i-1] = i*2;
//        }
//        return result;
//    }


