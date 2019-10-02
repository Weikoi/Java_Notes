import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\IdeaProjects\\summary\\Java_Notes\\src\\data\\a.txt");
        fw.write("Learing Java is a wise Decision!");
        fw.flush();
        fw.close();
    }
}
