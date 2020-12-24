import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class JC5311 {
    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[] {48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, Charset.forName("ASCII")));
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        try(ByteArrayOutputStream result = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            return result.toString(charset);
        }
    }
//        Reader reader = new InputStreamReader(inputStream, charset);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String string;
//        while ((string = bufferedReader.readLine()) != null) {
//            return string;
//        }
//        return null;
//        //        Scanner scanner = new Scanner(reader);
////        return scanner.next();
//
//    }
}
