import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class test {
    public static void main(String[] args) throws IOException {
        int totalBytesWritten = 0;
        byte [] buf = new byte[1024];
        int blockSize;

        OutputStream outputStream = null;
        while ((blockSize = inputStream.read(buf)) > 0) {
            outputStream.write(buf, 0, blockSize);
            totalBytesWritten += blockSize;
        }
    }
    public abstract class InputStream implements Closeable {
        public abstract int read() throws IOException;
        public int read(byte b []) throws IOException {
            return read(b, 0, b.length);
        }

    }
}