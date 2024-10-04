package OOPs.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

class BankAccountDeser {
    public static void main(String[] args) {
        // Try-with-resources for automatic resource management
        try (FileInputStream fis = new FileInputStream("bank.ser");
             ObjectInputStream ois = new ObjectInputStream(fis);
             Scanner sc = new Scanner(System.in)) {

            BankAccount[] obj = (BankAccount[]) ois.readObject();

            System.out.println("Enter the number of bank customers you want to read from the file:");
            int n = sc.nextInt();
            n = Math.min(n, obj.length);
            for (int i = 0; i < n; i++) {
                double interest = obj[i].bal * 0.05;
                obj[i].display();
                System.out.println("Interest Amount = " + interest);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
