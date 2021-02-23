package IO.FileClass;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class e4_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(
                "C:\\Users\\alsdn\\Desktop\\MineC\\Bucket\\spigot.yml");
        FileWriter fileWriter = new FileWriter(
                "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\FileClass\\OutFile.txt"
                        ,true);

        char[] cBuffer = new char[1000];
        fileReader.read(cBuffer);
        fileWriter.write(cBuffer);

        fileWriter.flush();
        fileReader.close();
        fileWriter.close();
    }
}
