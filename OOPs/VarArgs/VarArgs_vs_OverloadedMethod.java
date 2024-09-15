// compiler gives preference to (exact-match) overloaded method 
package PW.OOPs.VarArgs;

class Demo
{
    //Exact Match : One-Argument
    public void methodOne(int i){
        System.out.println("General method");
    }
    //Var-Args : 0 .... n
    public void methodOne(int... i){
        System.out.println("Var-Arg method");
    }
}
public class VarArgs_vs_OverloadedMethod {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.methodOne();//Var-Arg
        d1.methodOne(10);//General method
        d1.methodOne(10,20);//Var-Arg method
    }
}