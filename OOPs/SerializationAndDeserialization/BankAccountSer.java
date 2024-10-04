package OOPs.SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class BankAccountSer {
    public static void main(String[] args) {
        // Try-with-resources for automatic resource management
        try (FileOutputStream fos = new FileOutputStream("bank.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             Scanner sc = new Scanner(System.in)) {

            // Creating the array of objects
            System.out.println("Enter the number of bank customers:");
            int n = sc.nextInt();
            BankAccount[] obj = new BankAccount[n];

            String accNo;
            String name;
            double bal;
            for (int i = 0; i < n; i++) {
                obj[i] = new BankAccount();

                System.out.println("Enter the Account Number: ");
                accNo = sc.next();
                sc.nextLine(); // Consume newline
                System.out.println("Enter the Name: ");
                name = sc.nextLine();

                System.out.println("Enter the Balance Amount: ");
                bal = sc.nextDouble();
                sc.nextLine(); // Consume newline
                obj[i].input(accNo, name, bal);
            }
            oos.writeObject(obj);
            System.out.println("Successful Serialization");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
