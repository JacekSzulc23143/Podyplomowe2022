package pl.gda.wsb;

import pl.gda.wsb.creatures.Animal;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.creatures.Pet;
import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Device;
import pl.gda.wsb.device.Phone;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
        // pamięci.
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Pet cat = new Pet("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("Pet.toString(): " + cat);

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

        System.out.println(pasat1 instanceof Car);
        System.out.println(pasat1 instanceof Device);

        System.out.println(pasat1);

    }
}
