package OOPs.MethodOverloading;
// Case 1: Automatic type promotion in over loading

class Calculator3
{
    public void add(int a){
        System.out.println("int argument");
    }
    public void add(float a){
        System.out.println("float argument");
    }
}
 public class MethodOverloading2_TypePromotion {
    public static void main(String[] args) {
        Calculator3 c = new Calculator3();
        c.add('a');//char----> char,int
        c.add(19L);//long----> long,float,double

        //Compiler Error: no suitable method found
        //c.add(10.5);   //double -->double
    }
}