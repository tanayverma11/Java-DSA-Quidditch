package OOPs.GettersSetters;

class Student{
    // Data-Security
    private int rollno;
    private  String name;
    private String address;

    // Setter methods
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // Getter methods
    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student s1 =new Student();

        //calling setter methods
        s1.setRollno(10);
        s1.setName("Sachin");
        s1.setAddress("Mumbai");

        //calling getter methods
        System.out.println("Roll no. is :: "+s1.getRollno());
        System.out.println("Name     is :: "+s1.getName());
        System.out.println("Address  is :: "+s1.getAddress());
    }
}
