package Abstraction;

abstract class Plane
{
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}
class CargoPlane extends Plane
{
    public void takeOff(){
        System.out.println("CargoPlane tookOff..");
    }
    public void fly(){
        System.out.println("CargoPlane flying..");
    }
    public void land(){
        System.out.println("CargoPlane landing..");
    }
}
class PassengerPlane extends Plane
{
    public void takeOff(){
        System.out.println("PassengerPlane tookOff..");
    }
    public void fly(){
        System.out.println("PassengerPlane flying..");
    }
    public void land(){
        System.out.println("PassengerPlane landing..");
    }
}
class FighterPlane extends Plane
{
    public void takeOff(){
        System.out.println("FighterPlane tookOff..");
    }
    public void fly(){
        System.out.println("FighterPlane flying..");
    }
    public void land(){
        System.out.println("FighterPlane landing..");
    }
}
class Airport
{
    public void allowPlane(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}
public class Test0 {
    public static void main(String[] args) {
        Airport a =new Airport();
        a.allowPlane(new PassengerPlane());
        a.allowPlane(new FighterPlane());
        a.allowPlane(new CargoPlane());
    }
}

