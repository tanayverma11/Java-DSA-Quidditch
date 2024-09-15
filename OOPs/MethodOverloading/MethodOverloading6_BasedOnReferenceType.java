package OOPs.MethodOverloading;
//Case5: In case of method overloading, compiler will bind the method call based on the
//reference type but not on the runtime object

class Animal{}
class Monkey extends Animal
{
}
class AnimalApp
{
    public void m1(Monkey m){
        System.out.println("Monkey version...");
    }
    public void m1(Animal a){
        System.out.println("Animal version...");
    }
}
public class MethodOverloading6_BasedOnReferenceType {
    public static void main(String[] args)
    {
        AnimalApp a = new AnimalApp();
        Monkey m = new Monkey();
        a.m1(m);//m(Monkey) ----> Monkey
        Animal animal = new Animal();
        a.m1(animal);//animal ---> Animal
        Animal an = new Monkey();
        a.m1(an);//an(Animal) ----> Animal
    }
}