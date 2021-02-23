package IO.ObjectIO;

import java.io.*;

public class Child_Serializable extends Parent_NotSerializable implements Serializable {

    public String childField;

    public Child_Serializable(){
        this.parentField = "부모의 필드";
        this.childField = "자식의 필드";
    }


    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException{
        System.out.println("직렬화시 writeObject가 호출되었당");
        out.writeUTF(parentField);
        out.defaultWriteObject();
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        System.out.println("역직렬화시 readObject가 호출되었당");
        parentField = in.readUTF();
        in.defaultReadObject();
    }


}
