package pl.gda.wsb.creatures;

public abstract class Animal implements Feedable {
    private static final Double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.5;
    static final Double DEFAULT_WEIGHT = 5.0;

    public final String species;  // informacja tekstowa. Pola finalne to są takie pola w których raz tylko można ustawić
    // wartość.
    private Double weight; // liczba zmienno przecinkowa. Pola prywatne nie mogą być modyfikowane z każdego miejsca w kodzie.
    public Integer age;           // liczba całkowita
    public String name;    // informacja tekstowa. Pola publiczne mogą być modyfikowane z każdego miejsca w kodzie.
    public Boolean isAlive;       // true false - tak nie

    public Animal(String species) { // Konstruktor specjalna metoda. Żeby utworzyć zmienną musisz podać gatunek (String species). Za każdym razem gdy utworzymy nowe zwierzę to wykona się ten kawałek kodu.
        this.isAlive = true;        // każde zwierzę na początku jest żywe (this - to zwierzę które właśnie tworzymy)
        this.age = 1;               // każde zwierzę ma wiek 1
        this.species = species;     // gatunek tego zwierzęcia to będzie dokładnie ten sam gatunek który został przekazany w (String species)

        switch (this.species) {                   // dla różnych wartości tego pola (this.species) wykonaj
            case "felis":                         // jeżeli felis
                this.weight = DEFAULT_CAT_WEIGHT; // to waga równa się 2 kg
                break;                            // zakończ pracę
            case "canis":                         // jeżeli canis
                this.weight = DEFAULT_DOG_WEIGHT; // to waga równa się 10 kg
                break;                            // zakończ pracę
            default:                              // a w każdym innym przypadku
                this.weight = DEFAULT_WEIGHT;     // waga równa się 5 kg
                break;                            // zakończ pracę
        }

        /* Alternatywne rozwiązanie powyższego:
        if (this.species.equals("canis")) {        // jeżeli ten gatunek równa się canis
            this.weight = 9.0;                    // to waga równa się 9 kg
        } else if (this.species.equals("felis")) { // a inaczej jeżeli ten gatunek równa się felis
            this.weight = 2.5;                     // to waga równa się 2.5 kg
        } else {                                   // a w każdym innym przypadku
            this.weight = 5.0;                     // waga równa się 5 kg
        }
        */
    }

    public Double getWeight() {
        return this.weight;
    }

    /* Czy jesteście w stanie zrobić takie zadanie:
    Dodaj metody void feed() i void takeForAWalk() w klasie Animal.
    Karmienie zwierzęcia powinno zwiększać jego masę, wyprowadzenia na spacer zmniejszać.
    Jeśli masa zwierzęcia spadnie do 0 zwierze nie żyje.
    Kolejne próby karmienia lub wyprowadzania na spacer powinny skończyć odpowiednio pasywno-agresywnym komunikatem. */

    void feed() { // metoda void feed()
        if (isAlive) {
            weight += 1.0; // weight = weight + 1
            System.out.println("thx for food");
        } else {
            System.out.println("trochę za późno");
        }
    }

    void takeForAWalk() { // metoda void takeForAWalk()
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

    public abstract String toString();
}

