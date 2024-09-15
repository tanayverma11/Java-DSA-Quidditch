package PW.OOPs.MethodOverloading;

class Calculator1{
    public void add(int a, int b){
        System.out.println("int-int argument");
    }
    public void add(float a, float b){
        System.out.println("float-float argument");
    }
    public void add(double a, double b){
        System.out.println("double-double argument");
    }
}
public class MethodOverloading1 {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.add(10, 20); // int-int
        c.add(10.0f, 20.0f); // float-float
        c.add(10.0, 10.0); // double-double
    }
}
