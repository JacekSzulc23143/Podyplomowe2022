package pl.gda.wsb;

public class Animal {
    final String species; // informacja tekstowa
    private Double weight; // liczba zmienno przecinkowa
    Integer age; // liczba całkowita
    public String name; // informacja tekstowa
    Boolean isAlive; // true false - tak nie

    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species){
            case "felis":this.weight = 2.0; break;
            case "cannis":this.weight = 10.0; break;
            default: this.weight = 5.0; break;
        }

    }

    /* Czy jesteście w stanie zrobić takie zadanie:
    Dodaj metody void feed() i void takeForAWalk() w klasie Animal.
    Karmienie zwierzęcia powinno zwiększać jego masę, wyprowadzenia na spacer zmniejszać.
    Jeśli masa zwierzęcia spadnie do 0 zwierze nie żyje.
    Kolejne próby karmienia lub wyprowadzania na spacer powinny skończyć odpowiednio pasywno-agresywnym komunikatem. */

    void feed() {
        if (isAlive) {
            weight += 1.0; // weight = weight + 1
            System.out.println("thx for food");
        } else {
            System.out.println("trochę za późno");
        }
    }

    void takeForaWalk() {
        if (isAlive) {
            weight -= 1.0; // weight = weight - 1
            System.out.println("nice walk, thx");
            if (weight <= 0.0) {
                isAlive = false;
            }
        } else {
            System.out.println("halo policja, ktoś targa martwe zwierze po chodniku");
        }
    }
}