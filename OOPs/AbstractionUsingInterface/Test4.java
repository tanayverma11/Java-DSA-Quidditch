package OOPs.AbstractionUsingInterface;

interface ICalculator4
{
    //public abstract
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
//parent of 'CalculatorImpl3' class are:
// 1. Object class at class level
// 2. 'ICalculator4' at interface level
class CalculatorImpl3 implements ICalculator4
{
    public void add(int a,int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}
public class Test4 {
    public static void main(String[] args) {
        //loose coupling : Polymorphism
        ICalculator4 calculator = new CalculatorImpl3();

        calculator.add(10,20);
        calculator.sub(100,20);
        calculator.mul(10,20);
        calculator.div(100,20);
    }
}