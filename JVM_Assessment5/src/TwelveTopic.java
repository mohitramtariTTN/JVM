/***
 * Question : Demonstrate the use of Sealed Classes.
 * Sealed classes are used,so that only selected classes can inherit that class. It is done using
 * 'permit' keyword.
 */

sealed class Vehicle permits Car, Truck{
    protected final String registrationNumber;
    protected int noOfTyres;

    public Vehicle(String registrationNumber, int noOfTyres) {
        this.registrationNumber = registrationNumber;
        this.noOfTyres = noOfTyres;
    }
}

/*** Permitted sub-classes can either be final, sealed or non-sealed ***/
final class Car extends Vehicle{
    public Car(String registrationNumber, int noOfTyres) {
        super(registrationNumber, noOfTyres);
    }
}

non-sealed class Truck extends Vehicle{
    public Truck(String registrationNumber, int noOfTyres) {
        super(registrationNumber, noOfTyres);
    }
}

/*** Here, if i want that if any other class other than permitted class tries to extend Vehicle class,
 * then it will give an error
 */
//class Bus extends Vehicle{
//
//}
public class TwelveTopic {
    Car car1 = new Car("0936",4);
    Truck truck = new Truck("3402",10);
}
