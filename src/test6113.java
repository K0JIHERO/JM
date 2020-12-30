import java.util.ArrayList;
import java.util.Arrays;

public class test6113 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4 }; // Original array.
        int[] result = new int[array.length - 1]; // Array which will contain the result.
        int index = 1; // Remove the value "2".

// Copy the elements at the left of the index.
        System.arraycopy(array, 0, result, 0, index);
// Copy the elements at the right of the index.
        System.arraycopy(array, index + 1, result, index, array.length - index - 1);

        System.out.println(Arrays.toString(result)); //[1, 3, 4]
    }
}
