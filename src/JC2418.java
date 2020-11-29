import java.util.Arrays;

public class JC2418 {
    public static void main(String[] args) {
        int[] a = {0,2,2};
        int[] b = {1,3,1};
        mergeArrays(a,b);
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] summ = new int[4];
        int countera1 = 0;
        int countera2 = 0;
        for (int i = 0; i < 4; i++) {
            if (a1[i+countera1] < a2[i+countera2]) {
                summ[i] = a1[i];
                countera1++;
            }
            else if (i >= a1.length) {
                summ[i] = a2[i];
            }
            else if (i >= a2.length) {
                summ[i] = a1[i];
            }
            else {
                summ[i] = a2[i];
                countera2++;

            }


        }
        System.out.println(Arrays.toString(summ));
        return summ;
    }
}
