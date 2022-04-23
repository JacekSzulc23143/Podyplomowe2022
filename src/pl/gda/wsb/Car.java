package pl.gda.wsb;

public class Car {
    final String model;    // informacja tekstowa
    final String producer; // informacja tekstowa
    Double millage;        // liczba zmienno przecinkowa
    Double engineVolume;   // liczba zmienno przecinkowa
    String color;          // informacja tekstowa
    Double value;

    public Car(String model, String producer) { // prawym Generate... Constructor
        this.model = model;
        this.producer = producer;
    }
}

