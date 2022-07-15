package pl.gda.wsb.device;

import pl.gda.wsb.creatures.Human;

import java.util.Objects;

public abstract class Car extends Device implements Rechargeable {
    public Double millage;
    public Double engineVolume;
    public String color;
    public Double value;

    // Konstruktor który tworzy nowy samochód. Prawym Generate... Constructor
    public Car(String model, String producer, int yearOfProduction, Double value) {
        super(model, producer, yearOfProduction);
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("modlę się");
        System.out.println("przeklinam");
        System.out.println("odpalił");
    }

    // przesłonięta metoda z Device
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

    // metoda która sprzedaje samochody
    // Zadanie 11 pkt 7.
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this))
            throw new Exception("Sprzedawca nie ma auta.");
        if(!buyer.hasFreeParkingLot())
            throw new Exception("Kupujący nie ma miejsca.");
        if(buyer.cash< price)
            throw new Exception("Kupujący nie ma kasy.");
        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash +=price;
        buyer.cash += price;
        System.out.println("Sprzedano.");
    }
//        // poprzednia metoda.
//        public void sell(Human seller, Human buyer, Double price) throws Exception {
//            if (seller.getCar() != this) {
//                throw new Exception("Sprzedawca nie ma samochodu");
//            }
//            if (buyer.cash < price) {
//                throw new Exception("Kupujący nie ma kasy");
//            }
//
//            buyer.cash -= price;
//            seller.cash += price;
//            buyer.car = this;
//            seller.car = null;
//            System.out.println("Sprzedano samochód");
//        }

    // Dodaj abstrakcyjną metodę refuel() do Car.
    public abstract void refuel();
}


