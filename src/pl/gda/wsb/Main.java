package pl.gda.wsb;

public class Main { // klasy nazywamy z Wielkiej litery "Main"

    public static void main(String[] args) {
        Animal dog = new Animal(); // tworzymy obiekt, nazwę obiektu piszemy z małej litery "dog", zarezerwowanie pamięci
        dog.species = "canis"; // intelij podpowiada ctrl + spacja
        dog.isAlive = true; // nazwę pola piszemy z małej litery
        dog.name = "Szarik";
        dog.weight = 10.0;

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

//        Animal cat = new Animal("felis");
//        cat.isAlive = true;
//        cat.name = "Sierściuch";

        Human kacper = new Human();
        kacper.firstName = true;
        kacper.name = "Sierściuch";

        Car cat = new Car();
        car.isAlive = true;
        car.name = "Sierściuch";

        kacper.pet = dog;
        kacper.mobile = new Phone();

        kacper.mobile.model = "6s";
        kacper.mobile.producer = "apple";
        kacper.pet.feed();

        kacper.car = new Car("passat","vw");
        kacper.car.millage = 200000.0;
        System.out.println(kacper.car.millage);

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());

//        System.out.println("ten kot to " + cat.name);
//        System.out.println(cat.weight);
//
//        Phone iphone6s = new Phone();
//        iphone6s.producer = "Apple";
//        iphone6s.model = "6s";
//        iphone6s.screenSize = 4.2;
//        iphone6s.os = "ios";
//
//        System.out.println(iphone6s.producer + " " + iphone6s.model);

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        System.out.println(dog.weight);

        dog.takeForaWalk();

        System.out.println(dog.weight);
    }
}
