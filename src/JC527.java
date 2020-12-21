import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JC527 {
    public static void main(String[] args) throws IOException {
        byte[] arr = {1, 2, 9, 6, -13}; System.out.println(new JC527().sumOfStream(new ByteArrayInputStream(arr)));
    }
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int a = 0;
        int summ = 0;
        while ((a =  inputStream.read()) != -1) {
            summ += (byte) a;
        }
        return summ;
    }
}

