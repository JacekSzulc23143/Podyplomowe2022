package pl.gda.wsb;

public class Car {
    final String model = "vw"; // informacja tekstowa
    final String producer = "passat"; // informacja tekstowa
    Double millage; // liczba zmienno przecinkowa
    Double engineVolume; // liczba zmienno przecinkowa
    String color; // informacja tekstowa
    double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

}

