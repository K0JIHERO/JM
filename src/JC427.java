import java.io.Closeable;
import java.io.IOException;

public class JC427 {
    public static class Car implements AutoCloseable {

        static void drive() {
            System.out.println("Машина поехала.");
        }
        @Override
        public void close() throws RuntimeException {
            System.out.println("Машина закрывается...");
        }
    }
    public static void main(String[] args) {
        try (Car car = new Car();) {
            car.drive();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
