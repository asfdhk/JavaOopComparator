import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(312,245,90009,90009);
        ComparatorInt com = new ComparatorInt();
        System.out.println(numbers);
        numbers.sort(com);
        System.out.println(numbers);
        System.out.println(check(numbers));
    }

    static Integer check(List<Integer> a){
        if (a.get(0).equals(a.get(1))) {
            return a.get(a.size()-1);
        }else {
            return a.get(0);
        }
    }
}
