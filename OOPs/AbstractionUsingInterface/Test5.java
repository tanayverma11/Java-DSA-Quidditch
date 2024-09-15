package OOPs.AbstractionUsingInterface;

interface ICalculator5
{
    //public abstract
    void add(int a,int b);
    void sub(int a,int b);
}
interface IAdvancedCalculator
{
    //public abstract
    void mul(int a,int b);
    void div(int a,int b);
}
class CalculatorImpl4 implements ICalculator5,IAdvancedCalculator
{
    //ICalculator5
    public void add(int a,int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
    //IAdvancedCalculator
    public void mul(int a,int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}
public class Test5 {
    public static void main(String[] args) {
    //loose coupling : Polymorphism
        ICalculator5 calculator = new CalculatorImpl4();
        calculator.add(10,20);
        calculator.sub(100,20);
    //loose coupling : Polymorphism
        IAdvancedCalculator advCalculator =new CalculatorImpl4();
        advCalculator.mul(10,20);
        advCalculator.div(100,20);
    }
}
