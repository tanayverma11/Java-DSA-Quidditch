package PW.OOPs.Variables;

class Worker{
    // instance variables
    String name;
    int age;

    // constructor
    Worker(String name, int age){
        this.name = name;
        this.age = age;
    }

    // instance method
    public void disp(){
        System.out.println("Name is :: "+name);
        System.out.println("Age is  :: "+age);
    }
}
public class InstanceVariable {
    public static void main(String[] args) {

        Worker w1 = new Worker("Ramesh",53);
        w1.disp();

        Worker w2 = new Worker("Suresh", 46);
        w2.disp();

    }
}
