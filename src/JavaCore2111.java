public class JavaCore2111 {
    public static void main(String[] args) {
        System.out.println(drawisMonitorsCounter(10, 3));

    }
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
}
