package pl.gda.wsb;

import pl.gda.wsb.creatures.*;
import pl.gda.wsb.device.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);
        System.out.println("=^=========linijka 17=========^=");

        Pet cat = new Pet("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("Pet.toString(): " + cat);
        System.out.println("=^=========linijka 24=========^=");

        Human kacper = new Human(3);
        kacper.age = 99;

//        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());
        System.out.println("=^=========linijka 31=========^=");

//        Car fiat = new Diesel("Fiat","Bravo", 2021);
//        fiat.value = 500.0;
//
//        kacper.setCar(fiat, 3);
        kacper.isAlive = false;
        System.out.println("=^=========linijka 38=========^=");

        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone("Apple", "6s", 2018, 1000.0, 5.5, "iOS");

        kacper.pet.feed();
        System.out.println("=^=========linijka 46=========^=");

//        System.out.println(kacper.getCar(1));
//        System.out.println(kacper);
        System.out.println("=^=========linijka 50=========^=");

//        Car pasat1 = new Diesel("VW", "Pasat", 2001);
//        pasat1.value = 1200.0;
//        pasat1.color = "Niebieski";
//        Car pasat2 = new Diesel("VW", "Pasat", 2001);
//        pasat2.value = 1300.0;

//        Human brotherInLaw = new Human(1);
//        brotherInLaw.cash = 3000.0;

//        kacper.setCar(pasat1, 1);
        System.out.println("=^=========linijka 62=========^=");

//        try {
//            pasat1.sell(kacper, brotherInLaw, 1000.0);
//        } catch (Exception e) {
//            System.out.println("Nie udało się sprzedać " + pasat1);
//            e.printStackTrace();
//        }

//        System.out.println("Samochód szwagra: " + brotherInLaw.getCar(1));
//        System.out.println("Samochód Kacpra: " + kacper.getCar(1));
        System.out.println("=^=========linijka 73=========^=");

//        Human sister = new Human(1);
//        sister.cash = 5000.0;
//
//        kacper.pet = brotherInLaw;

//        try {
//            brotherInLaw.sell(kacper, sister, 2.0);
//            System.out.println("Szwagier sprzedany");
//        } catch (Exception e) {
//            System.out.println("Szwagier nie sprzedany");
//            e.printStackTrace();
//        }

        Phone nokia = new Phone("Nokia", "6410", 2000, 500.0, 4.5, "Android");
        nokia.installAnApp("YouTube");
        System.out.println("=^=========linijka 90=========^=");

//        try {
//            nokia.sell(kacper, brotherInLaw, 800.0);
//        } catch (Exception e) {
//            System.out.println("Nie udało się sprzedać " + nokia);
//            e.printStackTrace();
//        }

//        sister.takeForAWalk();
        System.out.println("=^=========linijka 100=========^=");

        System.out.println(nokia.toString());
        System.out.println("=^=========linijka 103=========^=");

        FarmAnimal cow = new FarmAnimal("krówka");
        cow.beEaten();
        System.out.println("=^=========linijka 107=========^=");


        Car Audi = new LPG("Audi", "A3", 2021, 4344.54) {
            @Override
            public void refuel() {
            }
        };

        Car Golf = new Diesel("Volkswagen", "5", 2012, 54444.54) {
            @Override
            public void refuel() {
            }
        };
        Car Fiat = new Electric("Fiat", "Punto", 1993, 344.54) {
            @Override
            public void refuel() {
            }
        };

        // Zadanie nr 11.
        Human Brother = new Human();
        Brother.getSalary();
        Brother.setSalary(2333.0);
        Brother.getSalary();

        kacper.getSalary();
        kacper.setSalary(3000.0);
        kacper.getSalary();

        System.out.println(kacper.getCar(1));
        kacper.setCar(Audi, 1);
        System.out.println(kacper.getCar(1));

        kacper.garage[1] = Audi;
        kacper.getCar(1);
        kacper.garage[0] = Golf;
        System.out.println("=^=========linijka 147=========^=");

        Car passat = new Diesel("Volkswagen", "Passat B5", 2002, 3500.0);
        passat.refuel();
        System.out.println("---------");
        Car astra = new LPG("Opel", "Astra Classic", 1999, 2000.0);
        astra.refuel();
        System.out.println("---------");
        Car tesla = new Electric("Tesla", "S", 2021, 30000.0);
        tesla.refuel();
        System.out.println("---------");
        System.out.println("=^=========linijka 158=========^=");

        Human jacek = new Human();
        jacek.cash = 30000.0;

        Human radek = new Human(3);
        radek.firstName = "Radek";
        radek.lastName = "Białek";
        radek.mobile = new Phone("Apple", "7s", 2019, 1500.0, 6.0, "iOS");
        radek.pet = cat;
        radek.setSalary(100000.0);
        radek.cash = 19000.0;
        radek.setCar(passat, 0);
        radek.setCar(astra, 1);
        radek.setCar(tesla, 2);

        System.out.println(radek.getGarageValue());
        System.out.println(radek.sortGarage());
        System.out.println();
        System.out.println(radek);
        System.out.println("=^=========linijka 178=========^=");

        // Zadanie nr 12.
        System.out.println("Passat -ile transakcji: " + passat.howManyTransactions());
        radek.addCar(passat);
        System.out.println("Passat -ile transakcji: " + passat.howManyTransactions());
        System.out.println("Astra -ile transakcji: " + astra.howManyTransactions());
        radek.addCar(astra);
        System.out.println("Astra -ile transakcji: " + astra.howManyTransactions());
        System.out.println("Astra -rozmiar właścicieli: " + astra.owners.size());
        System.out.println("---------");
        astra.sell(radek, jacek, 1900.0);
        System.out.println("Astra -ile transakcji: " + astra.howManyTransactions());
        System.out.println("Astra -czy radek był właścicielem: " + astra.wasEverOwner(radek));
        System.out.println("Astra -czy radek sprzedał ją jackowi: " + astra.isSoldByTo(radek, jacek));
        System.out.println("Astra -czy jacek sprzedał ją radkowi: " + astra.isSoldByTo(jacek, radek));
        System.out.println("=^=========linijka 194=========^=");

    // Zadanie nr 13.
        Phone phone = new Phone("Apple", "iPhone 7", 2016, 1200.0, 4.7, "iOS");
        Phone phone2 = new Phone("Samsung", "Galaxy 7", 2016, 1000.0, 5.7, "Android");

        radek.cash = 6500.0;
        jacek.cash = 10.0;

        radek.mobile = phone;
        jacek.mobile = phone2;

        Application whatsApp = new Application("WhatsApp", "10.3.1", 0.0);
        Application beatFind = new Application("BeatFind", "8.5.0", 15.0);
        Application instagram = new Application("Instagram", "5.8.1", 0.0);
        Application spotify = new Application("Spotify", "2.2.7", 5.0);

        phone.installAnApp(radek,whatsApp);
        phone.installAnApp(radek,instagram);
        phone.installAnApp(radek,spotify);

        System.out.println(phone.hasApplication(whatsApp) + " \"WhatsApp\"");
        System.out.println(phone.hasApplication("WhatsApp") + " \"WhatsApp\"");
        System.out.println();
        System.out.println(phone.hasApplication(beatFind) + " \"BeatFind\"");
        System.out.println(phone.hasApplication("BeatFind") + " \"BeatFind\"");

        System.out.println();

        phone.showAllApplications();
        phone.showAllFreeApplications();

        System.out.println();
        phone.sortApplicationsByName();
        System.out.println();
        phone.sortApplicationsByPrice();
        System.out.println();

        phone2.installAnApp(jacek,beatFind);
        System.out.println(phone2.hasApplication(beatFind) + " \"BeatFind\"");
        System.out.println();
        phone2.installAnApp(jacek,spotify);
        System.out.println(phone2.hasApplication(spotify) + " \"Spotify\"");
        System.out.println();
        System.out.println("Ilość pieniędzy Radka: " + radek.cash);
        System.out.println("Ilość pieniędzy Jacka: " + jacek.cash);
    }
}
