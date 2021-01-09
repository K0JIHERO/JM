import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JC6215 {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.printf(String.valueOf(getSalesMap(buffReader)));
    }
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            String name = sc.next();
            Long money = sc.nextLong();
            if (!map.containsKey(name)) {
                map.put(name, money);
            } else map.merge(name, money, Long::sum);
        }
        return map;
    }
}
