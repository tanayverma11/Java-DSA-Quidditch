package PW.OOPs.MethodOverloading;
// Case 4: Ambiguous reference call

class Sample2
{
    public void methodOne(String s){
        System.out.println("String version...");
    }
    public void methodOne(StringBuffer o){
        System.out.println("StringBuffer version...");
    }
    public void methodOne(Object o){
        System.out.println("Object version...");
    }
}
public class MethodOverloading5_ObjectMatchingHierarchy
{
    public static void main(String[] args)
    {
        Sample2 s =new Sample2();
        s.methodOne(new String("sachin"));//String
        s.methodOne(new StringBuffer("sachin"));//StringBuffer
      //  s.methodOne(null);//CE: ambiguous call
    }
}