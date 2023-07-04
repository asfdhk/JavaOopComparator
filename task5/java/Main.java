import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<File> list  = new ArrayList<>();
        ComparatorFile com = new ComparatorFile();
        CreateFile a = new CreateFile("a","sdfasfsasad sad s!!!!!!!!!!!!!!!");
        CreateFile b = new CreateFile("b","sdfasfsasad !!!!!sad s");
        CreateFile c = new CreateFile("c","sdfasfsasad sad s ");
        list.add(a.create());
        list.add(b.create());
        list.add(c.create());
        System.out.println(list);
        list.sort(com);
        System.out.println(list);
    }
}
