import java.util.Comparator;
public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getName().length() > o2.getName().length()){
            return 1;
        }else if(o1.getName().length()<o2.getName().length()){
            return -1;
        }
        return 0;
    }
}
