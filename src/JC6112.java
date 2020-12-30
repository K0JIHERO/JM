import java.util.Objects;
import java.util.Optional;

public class JC6112 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(mustAlsoBeTrue);
        System.out.println(mustBeTrue);
        System.out.println(i);
        System.out.println(s);
        System.out.println(pair);
        System.out.println(pair2);

    }
    public static class Pair <T, Y> {
        private T value1;
        private Y value2;

        public Pair(T value1, Y value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public T getFirst() {
            return value1;
        }

        public Y getSecond() {
            return value2;
        }

        public static <T, Y> Pair <T, Y> of (T value1, Y value2) {
            return new Pair<>(value1, value2);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pair)) {
                return false;
            }

            Pair<?, ?> other = (Pair<?, ?>) obj;
            return Objects.equals(value1, other.value1) && Objects.equals(value2, other.value2);

        }

        @Override
        public int hashCode() {
            return Objects.hash(value1, value2);
        }
    }

}
