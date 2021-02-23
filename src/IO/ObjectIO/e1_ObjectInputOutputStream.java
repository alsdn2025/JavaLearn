package IO.ObjectIO;

import java.io.*;

public class e1_ObjectInputOutputStream {
    static class SomeObj implements Serializable {
        private final String name;
        public SomeObj(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(
            "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\ObjectIO\\Object.dat"
        );
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new String("ㄱㄴㄷ"));
        oos.writeObject(new SomeObj("어떤개체"));
        oos.flush(); oos.close();


        FileInputStream fis = new FileInputStream(
                "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\ObjectIO\\Object.dat"
        );
        ObjectInputStream ois = new ObjectInputStream(fis);
        String inputStr = (String) ois.readObject();
        SomeObj inputObj = (SomeObj) ois.readObject();
        ois.close(); fis.close();

        System.out.println(inputStr);
        System.out.println(inputObj.getName());

    }
}
