import java.util.Arrays;

public class JC2418 {
    public static void main(String[] args) {
        int[] a = {6,7,8,11};
        int[] b = {1};
        System.out.println(Arrays.toString(mergeArrays(a,b)));

    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] summ = new int[a1.length + a2.length];
        int a1counter = 0;
        int a2counter = 0;
        for (int i = 0; i < summ.length; i++) {
            if (a1counter >= a1.length) {
                summ[i] = a2[a2counter];
                a2counter++;
            } else if (a2counter >= a2.length) {
                summ[i] = a1[a1counter];
                a1counter++;
            } else if (a1[a1counter] < a2[a2counter]) {
                summ[i] = a1[a1counter];
                a1counter++;
            } else {
                summ[i] = a2[a2counter];
                a2counter++;
            }
        }
        return summ;
    }
}
