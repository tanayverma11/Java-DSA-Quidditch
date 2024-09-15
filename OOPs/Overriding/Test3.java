package PW.OOPs.Overriding;

class Animal
{
    public void eat(){
        System.out.println("Animal is Eating...");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping...");
    }
}
class Monkey extends Animal
{
    public void eat(){
        System.out.println("Monkey steals and eats..");
    }
    public void sleep(){
        System.out.println("Monkey is Sleeping...");
    }
}
class Deer extends Animal
{
    public void eat(){
        System.out.println("Deer graze and eats...");
    }
    public void sleep(){
        System.out.println("Deer is Sleeping...");
    }
}
class Lion extends Animal
{
    public void eat(){
        System.out.println("Lion hunts and eats...");
    }
    public void sleep(){
        System.out.println("Lion is Sleeping...");
    }
}
class Forest
{
    public void allowAnimal(Animal animal){
        animal.eat();
        animal.sleep();
        System.out.println();
    }
}
class Test3 {
    public static void main(String[] args) {
        Forest f =new Forest();
        f.allowAnimal(new Monkey());
        f.allowAnimal(new Deer());
        f.allowAnimal(new Lion());
    }
}
