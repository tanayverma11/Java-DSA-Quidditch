package PW.OOPs.SerializationAndDeserialization;
import java.io.*;
public class StudentDeserializable {
    public static void main(String[] args){
        try{
            //Creating stream to read the object
            FileInputStream fin = new FileInputStream("stu.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);

            Student s = (Student)ois.readObject();  //*** imp ***
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            fin.close();
            ois.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}

