package OOPs.MethodOverloading;
// Case 2: Ambiguous method call

class Calculator4 {
    public void add(int a,float b){
        System.out.println("int-float argument");
    }
    public void add(float a,int b){
        System.out.println("float-int argument");
    }
}
 public class MethodOverloading3_AmbiguousMethodCall {
    public static void main(String[] args)
    {
        Calculator4 c = new Calculator4();
        c.add(10,25.5f);//int,float
        c.add(20.5f,10);//float,int
        // c.add(10,20);//CE: ambiguous method call
    }
}