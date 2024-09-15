package OOPs.SerializationAndDeserialization;

import java.io.*;
public class StudentSerializable {
    public static void main(String []args){
        try{
            //creating stream & writing the object to a file
            FileOutputStream fos = new FileOutputStream("stu.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //creating object
            Student obj = new Student(101,"Tanay");
            oos.writeObject(obj);                           // *** important ***
            System.out.println("Successfully written to file!");
            oos.close();
            fos.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
