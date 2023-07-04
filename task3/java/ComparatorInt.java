import java.util.Comparator;

public class ComparatorInt implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (firstNumber(o1) + lastNumber(o1)> firstNumber(o2)+lastNumber(o2)){
            return -1;
        }else if(firstNumber(o1)+lastNumber(o1)<firstNumber(o2)+lastNumber(o2)){
            return 1;
        }
        return 0;
    }
    public Integer firstNumber(Integer a){
        Integer i = 0;
        while (a !=0){
            i = a%10;
            a = a /10;
        }
        return i;
    }
    public Integer lastNumber(Integer a){
        return a%10;
    }
}

