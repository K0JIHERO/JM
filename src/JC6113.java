import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class JC6113 {
    public static void main(String[] args) {
        DynamicArray<String> strings = new DynamicArray<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        System.out.println("After add");
        System.out.println("the length is: " +  strings.length());
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println();
        strings.remove(1);
        System.out.println("After remove");
        System.out.println("the length is: " +  strings.length());
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(strings.get(i));
        }
    }
    public static class DynamicArray <T> {

        public T[] array;
        private int size = 0;
        private int index = 0;

        public DynamicArray() {
            array = (T[])new Object[size];
        }

        public int length(){
            return array.length;
        }

        public void add(T el) {
//            T [] newArray = Arrays.copyOf(array, array.length + 1);
//            newArray [array.length] = el;
//            array = Arrays.copyOf(newArray, newArray.length);
            array = Arrays.copyOf(array, array.length + 1);
            array [index++] = el;
        }

        public void remove(int index) {
//            T [] newArray = (T[])new Object[array.length - 1];
//            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
            array[array.length - 1] = null;
//            array = newArray;
        }

        public T get(int index) {
            return array [index];
        }
    }
}

//T [] newArray = (T[])new Object[array.length - 1];
//System.arraycopy(array, 0, newArray, 0, index);
//System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
//array = newArray;