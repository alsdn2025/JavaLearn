package IO.ObjectIO;

import java.io.*;

public class e3_writeObj_readObjMethod {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\out\\production\\ThisJava_IO\\IO\\E3_Obj.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Child_Serializable child = new Child_Serializable();
        oos.writeObject(child);
        oos.flush(); oos.close(); fos.close();


        FileInputStream fis = new FileInputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\out\\production\\ThisJava_IO\\IO\\E3_Obj.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Child_Serializable inputChild = (Child_Serializable) ois.readObject();

        System.out.println("OriginChild hashcode : " + child.hashCode());
        System.out.println("InputChild hashcode : " + inputChild.hashCode());

        System.out.printf("디버깅");

    }

}
