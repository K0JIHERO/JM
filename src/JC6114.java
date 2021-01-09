import java.io.ByteArrayInputStream;
import java.util.*;
import java.io.Reader.*;
public class JC6114 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Deque<Integer> d = new ArrayDeque<>();
        int counter = 0;
        while (myObj.hasNextInt()) {
            d.addFirst(myObj.nextInt());
            if ((counter % 2) == 0) {
                d.removeFirst();
            }
            counter++;
        }
        d.iterator().forEachRemaining(System.out::println);
//        Iterator<Integer> iterator = deque.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
    }
}