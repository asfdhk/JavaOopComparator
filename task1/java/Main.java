import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);
        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
        CatComparator com = new CatComparator();
        Arrays.sort(cats,com);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
