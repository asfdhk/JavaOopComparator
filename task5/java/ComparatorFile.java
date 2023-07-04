import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class ComparatorFile implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        if (scan(o1)>scan(o2)){
            return 1;
        }else if(scan(o1)<scan(o2)){
            return -1;
        }
        return 0;
    }
    public int scan(File a){
        String text = "";
        int amount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(a));
            text = reader.readLine();
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0;i<text.length();i++){
            if (text.charAt(i) ==' '|| text.charAt(i) == '-'||text.charAt(i) =='?'||text.charAt(i) =='!'
                    || text.charAt(i) ==','||text.charAt(i)=='.'){
                amount++;
            }
        }
        return amount;
    }


}
