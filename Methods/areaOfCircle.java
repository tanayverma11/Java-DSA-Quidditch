package Methods;

import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float rad = sc.nextFloat();
        areaOfCircle obj = new areaOfCircle();
        System.out.println(obj.sq(rad));
    }
    float sq(float a) {
        return (float)(3.14*a*a);
    }
}
