package AbstractionUsingInterface;
// eg#2
interface ICalculator2
{
    //public abstract
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
abstract class CalculatorImpl implements ICalculator2
{
}