import java.lang.CharSequence;
import java.util.Arrays;

public class JC356 {


    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello

        //проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
        String[] aa = {"sad","sad"};

        System.out.println(aa.length);
    }

    public static class AsciiCharSequence implements CharSequence {

        byte[] a;

        public AsciiCharSequence(byte[] a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return new String(Arrays.copyOfRange(a, 0, a.length));
        }

        @Override
        public int length() {
            return a.length;
        }

        @Override
        public char charAt(int index) {
            return (char) a[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(java.util.Arrays.copyOfRange(a, start, end));
        }

    }
}
