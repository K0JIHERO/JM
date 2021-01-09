import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class testElena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b;
        Deque <Integer> arrayDeque = new ArrayDeque<Integer>();
        while (scanner.hasNext()) {
            b = scanner.nextInt();
            arrayDeque.addLast(b);
        }
        int size = arrayDeque.size();
        for (int i = 1; i < size; i=i+2) {
            arrayDeque.remove(i);
        }
        while (arrayDeque.peekLast() != null) {
            System.out.print(arrayDeque.pollLast() + " ");
        }
    }
}