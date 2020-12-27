import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class JC547 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byte[] intermediate = null;
        try (
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Animal("Dog"));
            oos.writeObject(new Animal("Cat"));
            oos.writeObject(new Animal("Mouse"));

            output.flush();
            intermediate = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(intermediate));
        Animal[] animals = deserializeAnimalArray(intermediate);
        System.out.println(Arrays.toString(animals));

    }
    static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
    public static Animal[] deserializeAnimalArray(byte[] data){
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
            ObjectInputStream objectInputStream = null;
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            int z;
            z = objectInputStream.readInt();
            Animal [] array = new Animal [z];
            for (int i = 0; i < z; i++) {
                array[i] = (Animal) objectInputStream.readObject();
            }
            objectInputStream.close();
            return array;
        } catch (ClassNotFoundException | NegativeArraySizeException | NullPointerException | ClassCastException | IOException e) {
            throw new IllegalArgumentException();
        }
    }
}


//    public static Animal[] deserializeAnimalArray(byte[] data){
//        try {
//            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
//            ObjectInputStream objectInputStream = null;
//            objectInputStream = new ObjectInputStream(byteArrayInputStream);
//            int z;
//            z = objectInputStream.readInt();
//            Animal [] array = new Animal [z];
//            for (int i = 0; i < z; i++) {
//                array[i] = (Animal) objectInputStream.readObject();
//            }
//            return array;
//        } catch (IOException | ClassNotFoundException | NegativeArraySizeException | NullPointerException e) {
//            throw new IllegalArgumentException();
//        }
//    }

