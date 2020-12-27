import java.util.Locale;
import java.util.Scanner;

public class JC5312 {
    public static void main(String[] args) {
        double summ = 0;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                double data = scan.nextDouble();
                summ = summ + data;
            } else {
                scan.next();
            }
        }
        scan.close();
        System.out.printf("%.6f", summ);
    }
}
