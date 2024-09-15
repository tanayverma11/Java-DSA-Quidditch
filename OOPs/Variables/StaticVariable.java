package OOPs.Variables;

class LoanApp{
    // static variable
    static  float rateOfInterest = 9.5f;
}
public class StaticVariable {
    public static void main(String[] args) {
        //static variable is accessed using => ClassName
        System.out.println(LoanApp.rateOfInterest);
        //static variable is accessed using => reference of the Object
        System.out.println(new LoanApp().rateOfInterest);
    }
}
