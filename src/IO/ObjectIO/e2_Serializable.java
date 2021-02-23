package IO.ObjectIO;

import java.io.*;

public class e2_Serializable {
    static class SerializableClass implements Serializable{
        public String field;
        public transient String transientField;
        public String newField;

        @Serial
        private static final long serialVersionUID = -3427081530613400953L;

        public SerializableClass(){
            this.field = "this class can be serialized";
            this.transientField = "But this class cant be serialized";
        }

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream(
                "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\ObjectIO\\Object.dat"
        );
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        SerializableClass Obj = new SerializableClass();
        oos.writeObject(Obj);
        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream(
                "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\ObjectIO\\Object.dat"
        );
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableClass InputObj = (SerializableClass) ois.readObject();
        ois.close(); fis.close();


        System.out.println("field : " + InputObj.field);
        System.out.println("transient field : " + InputObj.transientField);
        System.out.println("newField : " + InputObj.newField);



    }
}

