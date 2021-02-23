package IO;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintfEx {
    public static void main(String[] args){
        PrintStream So = System.out;
        So.printf("%d %d %n",123, 456);
        So.printf("%2$d %1$d %n",123, 456);

        So.printf("%10d %n",12345);
        So.printf("%-10d %n",12345);
        So.printf("%010d %n",12345);


        So.printf("%05.1f %n",12345.12345f);
        So.printf("%03.3f %n",12345.12345f);
        So.printf("%01.10f %n",12345.12345f);

        So.printf("%1$tY년 %1$tm월 %1$td일 \n", new Date());

    }
}
