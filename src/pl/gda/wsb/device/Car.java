package pl.gda.wsb.device;

import java.util.Objects;

public abstract class Car extends Device{
    public Double millage;        // liczba zmienno przecinkowa
    public Double engineVolume;   // liczba zmienno przecinkowa
    public String color;          // informacja tekstowa
    public Double value;          // dodaj pole wartość (ofkoz po angielsku) do samochodu

    public Car(String model, String producer, Integer yearOfProduction) { // Konstruktor. Prawym Generate... Constructor
        super(model, producer, yearOfProduction);
    }

    public void turnOn() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, millage, engineVolume, color, value);
    }
    //
}


