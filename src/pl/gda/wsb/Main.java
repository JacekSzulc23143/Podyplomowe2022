package pl.gda.wsb;

import pl.gda.wsb.creatures.Animal;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.creatures.Pet;
import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Device;
import pl.gda.wsb.device.Phone;

public class Main { // klasy nazywamy z Wielkiej litery "Main". Nazywanie zmiennych, klas, metod piszemy po angielsku.

    public static void main(String[] args) {     // statyczna metoda main uruchamia cały program.
        Animal dog = new Pet("canis"); // tworzymy obiekt, nazwę obiektu piszemy z małej litery "dog", zarezerwowanie
        // pamięci.
        dog.isAlive = true;                      // nazwę pola piszemy z małej litery. Intellij podpowiada ctrl + spacja.
        dog.name = "Szarik";                     // pola służą do przechowywania danych, a metody służą do operowania na tych danych.

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Pet("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("Pet.toString");

        Human kacper = new Human();
        kacper.age = 99;

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());

        Car fiat = new Car("bravo","fiat", 2021);
        fiat.value = 500.0;

        kacper.setCar(fiat);
        kacper.isAlive = false;

        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone("6s", "apple", 2018);

        kacper.pet.feed();

        System.out.println(kacper.getCar());
        System.out.println(kacper);

        Car pasat1 = new Car("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        Car pasat2 = new Car("pasat", "vw", 2001);
        pasat2.value = 1300.0;

        System.out.println(pasat1.hashCode());
        System.out.println(pasat2.hashCode());

        if (pasat1.equals(pasat2)) {
            System.out.println("to samo auto");
        } else {
            System.out.println("inne auto");
        }

        kacper.feed();
        System.out.println(kacper.species);

//        Device fridge = new Device("S47632", "samsung", 2021);

        System.out.println(pasat1 instanceof Car);
        System.out.println(pasat1 instanceof Device);

        System.out.println(pasat1);

        //
    }
}
