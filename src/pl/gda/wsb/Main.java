package pl.gda.wsb;

import pl.gda.wsb.creatures.*;
import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Diesel;
import pl.gda.wsb.device.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);
        System.out.println("=^=========linijka 19=========^=");

        Pet cat = new Pet("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("Pet.toString(): " + cat);
        System.out.println("=^=========linijka 26=========^=");

        Human kacper = new Human();
        kacper.age = 99;

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());
        System.out.println("=^=========linijka 33=========^=");

        Car fiat = new Diesel("bravo","fiat", 2021);
        fiat.value = 500.0;

        kacper.setCar(fiat);
        kacper.isAlive = false;
        System.out.println("=^=========linijka 40=========^=");

        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone("6s", "apple", 2018);

        kacper.pet.feed();
        System.out.println("=^=========linijka 48=========^=");

        System.out.println(kacper.getCar());
        System.out.println(kacper);
        System.out.println("=^=========linijka 52=========^=");

        Car pasat1 = new Diesel("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        pasat1.color = "Niebieski";
        Car pasat2 = new Diesel("pasat", "vw", 2001);
        pasat2.value = 1300.0;

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 3000.0;

        kacper.setCar(pasat1);
        System.out.println("=^=========linijka 64=========^=");

        try {
            pasat1.sell(kacper, brotherInLaw, 1000.0);
        } catch (Exception e) {
            System.out.println("Nie udało się sprzedać " + pasat1);
            e.printStackTrace();
        }

        System.out.println("Samochód szwagra: " + brotherInLaw.getCar());
        System.out.println("Samochód Kacpra: " + kacper.getCar());
        System.out.println("=^=========linijka 75=========^=");

        Human sister = new Human();
        sister.cash = 5000.0;

        kacper.pet = brotherInLaw;

//        try {
//            brotherInLaw.sell(kacper, sister, 2.0);
//            System.out.println("Szwagier sprzedany");
//        } catch (Exception e) {
//            System.out.println("Szwagier nie sprzedany");
//            e.printStackTrace();
//        }

        Phone nokia = new Phone("6410", "Nokia", 2000);
        nokia.installAnApp("YouTube");
        System.out.println("=^=========linijka 92=========^=");

//        try {
//            nokia.sell(kacper, brotherInLaw, 800.0);
//        } catch (Exception e) {
//            System.out.println("Nie udało się sprzedać " + nokia);
//            e.printStackTrace();
//        }

        sister.takeForAWalk();
        System.out.println("=^=========linijka 102=========^=");

        System.out.println(nokia.toString());
        System.out.println("=^=========linijka 105=========^=");


    }
}
