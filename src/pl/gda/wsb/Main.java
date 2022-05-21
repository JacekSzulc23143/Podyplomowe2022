package pl.gda.wsb;

import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.creatures.Pet;
import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Phone;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
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
        pasat1.color = "Niebieski";
        Car pasat2 = new Car("pasat", "vw", 2001);
        pasat2.value = 1300.0;

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 3000.0;

        kacper.setCar(pasat1);

        try {
            pasat1.sell(kacper, brotherInLaw, 1000.0);
        } catch (Exception e) {
            System.out.println("Nie udało się sprzedać " + pasat1);
            e.printStackTrace();
        }

        System.out.println("Samochód szwagra: " + brotherInLaw.getCar());
        System.out.println("Samochód Kacpra: " + kacper.getCar());

        Human sister = new Human();
        sister.cash = 5000.0;

        kacper.pet = brotherInLaw;

        try {
            brotherInLaw.sell(kacper, sister, 2.0);
            System.out.println("Szwagier sprzedany");
        } catch (Exception e) {
            System.out.println("Szwagier nie sprzedany");
            e.printStackTrace();
        }

    }
}
