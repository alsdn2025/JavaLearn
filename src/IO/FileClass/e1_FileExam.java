package IO.FileClass;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class e1_FileExam {

    public static void main(String[] args) throws URISyntaxException, IOException {
        File dir = new File("C:/Temp/Dir");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:\\Temp\\file2.txt");
        File file3 = new File(new URI("file:///C:/Temp/file3.txt"));

        if(!dir.exists()){
            dir.mkdir();  // 부모 디렉토리가 없다면 예외 발생.
            dir.mkdirs(); // 부모 디렉토리가 없다면 부모디렉토리도 생성.
        }

        if(!file1.exists()){
            file1.createNewFile();
        }
        if(!file2.exists()){
            file2.createNewFile();
        }
        if(!file3.exists()){
            file3.createNewFile();
        }

        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        System.out.println("날짜        시간       형태   크기        이름");
        System.out.println("-------------------------------------");
        for (var file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            System.out.printf(" %s", file.isDirectory() ? "dir" : "file");
            System.out.printf(" %s", file.isDirectory() ? "\t" : "\t" + file.length());
            System.out.printf("\t\t\t%s", file.getName());
            System.out.print(System.lineSeparator());
        }

    }
}
