import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    private String text;
    private String nameFIle;
    public CreateFile(String nameFIle,String text){
        this.text = text;
        this.nameFIle = nameFIle;
    }

    public File create()  {
        File file = new File(getNameFIle() +".txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(getText());
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return file;
    }

    public String getText() {
        return text;
    }

    public String getNameFIle() {
        return nameFIle;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNameFIle(String nameFIle) {
        this.nameFIle = nameFIle;
    }
}
