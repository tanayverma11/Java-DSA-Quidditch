package PW.OOPs.Variables;

class Calculator{
    public void add(int a, int b){ // variables declared inside the method
        int result = a+b;
        System.out.println("The sum is :: "+result);
    }
}
public class LocalVariable {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
    }
}
