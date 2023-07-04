import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(312,245,90009);
        ComparatorInt com = new ComparatorInt();
        System.out.println(numbers);
        numbers.sort(com);
        System.out.println(numbers);
    }
}
