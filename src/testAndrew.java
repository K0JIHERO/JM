import java.io.ByteArrayInputStream;
import java.util.*;
import java.io.Reader.*;
public class testAndrew {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int counter = 0;
        while (myObj.hasNextInt()) {
            deque.addFirst(myObj.nextInt());
            if ((counter % 2) == 0) {
                deque.removeFirst();
            }
            counter++;
        }
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}