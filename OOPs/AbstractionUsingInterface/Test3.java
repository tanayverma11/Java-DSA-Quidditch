package OOPs.AbstractionUsingInterface;

// eg#3.
interface ICalculator3
{
    //public abstract
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
class CalculatorImpl2 implements ICalculator3
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