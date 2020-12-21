import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JC528 {
    public static void main(String[] args) {

    }
// как то выполнилось без перевода в байты!
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {

        int number;
        while ((number = inputStream.read()) > 0) {
            if (number % 2 == 0) {
                outputStream.write(number);
            }
        }
        outputStream.flush();
    }
}
