import java.util.function.DoubleToIntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class JC717 {
    public static void main(String[] args) {
        JC717 main = new JC717(); //ваш класс
        UnaryOperator unaryOperator = main.sqrt();
        System.out.println("2 -> " +  unaryOperator.apply(2));
        System.out.println("-4 -> " +  unaryOperator.apply(-4));
        System.out.println("6 -> " +  unaryOperator.apply(6));
        System.out.println("12 -> " +  unaryOperator.apply(12));
    }
    public UnaryOperator <Integer> sqrt() {
        return x -> x * x;
    }
}