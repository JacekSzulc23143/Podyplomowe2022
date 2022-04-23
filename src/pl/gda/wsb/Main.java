package pl.gda.wsb;

public class Main { // klasy nazywamy z Wielkiej litery "Main". Nazywanie zmiennych, klas, metod piszemy po angielsku.

    public static void main(String[] args) { // statyczna metoda main uruchamia cały program.
        Animal dog = new Animal("canis"); // tworzymy obiekt, nazwę obiektu piszemy z małej litery "dog", zarezerwowanie pamięci.
        dog.isAlive = true;        // nazwę pola piszemy z małej litery. Intellij podpowiada ctrl + spacja.
        dog.name = "Szarik";       // pola służą do przechowywania danych, a metody służą do operowania na tych danych.

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Animal("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

//        System.out.println(cat.name);
//        System.out.println("species: " + cat.species + " name: " + cat.name);

        Human kacper = new Human();

        kacper.setCar(new Car("bravo","fiat"));
        kacper.isAlive = false;

        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone();

        kacper.mobile.model = "6s";
        kacper.mobile.producer = "apple";
        kacper.pet.feed();

//        System.out.println(kacper.pet.name);

        kacper.setCar(new Car("passat", "vw"));
        System.out.println(kacper.getCar().millage);

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());

//        Car fiat = new Car("bravo", "fiat");
//        Car pasat = new Car("passat", "vw");

/*      Typy proste
        Integer i = 2; // Klasa, ctrl + klik lewym
        byte bt;
        short s = 32;
        int j = 2;
        long l = 123123123;
        float f = 32.222f;
        double d = 32.232;
        char c = 'c';
        boolean b = true;
*/

//        System.out.println("ten kot to " + cat.name);
//        System.out.println(cat.weight);

//        Phone iphone6s = new Phone();
//        iphone6s.producer = "Apple";
//        iphone6s.model = "6s";
//        iphone6s.screenSize = 4.2;
//        iphone6s.os = "ios";
//
//        System.out.println(iphone6s.producer + " " + iphone6s.model);

//        System.out.println(dog.weight);

    }
}
