import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double summ = 0;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            try {
                double data = Double.parseDouble(scan.next());
                summ += data;
            } catch (Exception e) {
                continue;
            }
        }
        scan.close();
        System.out.printf("%.6f", summ);
    }
}