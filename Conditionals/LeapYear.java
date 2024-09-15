package Conditionals;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        LeapYear obj = new LeapYear();
        obj.leap(year);
    }
    void leap(int y){
        if( (y%4==0) && (y%100!=0) )
            System.out.println(y+" is a Leap Year");
        else if ( (y%100==0) && (y%400==0) )
            System.out.println(y+" is a Leap Year");
        else
            System.out.println(y+" is Not a Leap Year");
    }
}
