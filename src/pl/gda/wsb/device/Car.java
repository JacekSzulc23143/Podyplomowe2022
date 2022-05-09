package pl.gda.wsb.device;

import java.util.Objects;

public class Car extends Device implements Rechargeable {
    public Double millage;
    public Double engineVolume;
    public String color;
    public Double value;

    // Konstruktor. Prawym Generate... Constructor
    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("modlę się");
        System.out.println("przeklinam");
        System.out.println("odpalił");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", millage=" + millage +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                '}';
    }

    // porównywanie
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() { return Objects.hash(model, producer, millage, engineVolume, color, value); }

    @Override
    public void recharge() {
        System.out.println("podjedź na stację");
        System.out.println("zacznij płakać");
        System.out.println("sprawdź stan konta");
        System.out.println("przemyśl to poważnie");
        System.out.println("zatankuj");
        System.out.println("płacz nadal");
        System.out.println("zapłać");
    }
}


