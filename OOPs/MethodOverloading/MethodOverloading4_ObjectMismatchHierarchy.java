package OOPs.MethodOverloading;
// Case 3: Mismatch in Object Hierarchy

class Sample
{
    public void methodOne(String s){
        System.out.println("String version...");
    }
    public void methodOne(Object o){
        System.out.println("Object version...");
    }
}
public class MethodOverloading4_ObjectMismatchHierarchy
{
    public static void main(String[] args)
    {
        Sample s =new Sample();
        s.methodOne("sachin");//String --> String
        s.methodOne(new Object());//Object --> Object
        s.methodOne(null);// null ---> String(reference), Object(reference)
    }
}
