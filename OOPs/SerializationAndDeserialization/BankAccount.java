package OOPs.SerializationAndDeserialization;
import java.io.*;
class BankAccount implements Serializable {
    String accNo;
    String name;
    double bal;
    void input(String accNo, String name, double bal){
        this.accNo=accNo;
        this.name=name;
        this.bal=bal;
    }
    void display(){
        System.out.println("Displaying the details:");
        System.out.println("Account Number= "+accNo+" Name = "+name+ " Balance = "+bal);
    }
}