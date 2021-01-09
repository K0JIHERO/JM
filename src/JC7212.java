import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JC7212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8").useDelimiter("[^a-zA-Zа-яА-Я0-9]+");
        List <String> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.next().toLowerCase());
        }
        Map<String, Long> counted = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        counted.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry::getKey))
                .limit(10)
                .forEach(entry -> {System.out.println(entry.getKey());});
    }
}

//    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.