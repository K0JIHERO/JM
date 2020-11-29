import java.util.Arrays;

public class JC2417 {
    public static void main(String[] args) {
        int[] a = {1,4,5,6,84,56,334,2,7,7,9,-3,13,15};
        printOddNumbers(a);
    }
    public static void printOddNumbers(int[] arr) {
        StringBuffer s = new StringBuffer();
        for (int i : arr) {
            if (i % 2 == 1 || i % 2 == -1) {
                s.append(i);
                s.append(",");
            }
        }
        s.deleteCharAt(s.length()-1);
        System.out.println(s);
    }
}
