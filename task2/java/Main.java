import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,-2,-7,3,-5,2);
        Comparator<Integer> com = Comparator.comparingInt(Math::abs);
        numbers.sort(com);
        Integer least = numbers.get(0);
        System.out.println(least);
    }
}
