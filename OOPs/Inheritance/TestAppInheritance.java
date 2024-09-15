package PW.OOPs.Inheritance;

class Person{
    // instance variables
    public String name;
    public String address;
    public int age;
}

class Student1 extends Person{
    // instance variables
    public String grade;
    public int marks;

    // Parameterized Constructor
    Student1(String name, String address, int age, int marks, String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    // normal method
    public void disp(){
        System.out.println("Name is    :: "+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age is     :: "+age);
        System.out.println("Marks is   :: "+marks);
        System.out.println("Grade is   :: "+grade);
    }
}

public class TestAppInheritance {
    public static void main(String[] args) {
        Student1 student = new Student1("Sachin", "MI", 51, 100, "A");
        student.disp();
    }
}
