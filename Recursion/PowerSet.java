package Recursion;
import java.util.Scanner;
// Integer Subsets from 1 to N
public class PowerSet {
    public static void generatePowerSet(int i, int n, String ans) {
        // Base case: all elements considered
        if (i == n + 1) {
            System.out.println(ans);
            return;
        }
        generatePowerSet(i + 1, n, ans + i + " "); // include
        generatePowerSet(i + 1, n, ans); // exclude
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        generatePowerSet(1, n, "");
        scan.close();
    }
}