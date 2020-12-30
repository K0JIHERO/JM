import java.util.Optional;

public class JC6111 {
    public static class Box <T> {
        private T object;

        public Box(Object o) {
        }

        public static <T> Box <T> getBox() {
            Box<T> box = new Box<T>(null);
            return box;
        }
    }
}




