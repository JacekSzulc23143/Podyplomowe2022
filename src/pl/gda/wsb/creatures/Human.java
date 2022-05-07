package pl.gda.wsb.creatures;

import pl.gda.wsb.creatures.Animal;
import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Phone;

public class Human extends Animal {
    public String firstName; // kolejno typ zmiennej i nazwa zmiennej
    public String lastName;

    public Phone mobile;
    public Pet pet;
    private Car car; // zmień pole Car w człowieku na pole prywatne
    private Double salary;

    public Human() {
        super("homo sapiens");
    }

    // dodaj getter do człowieka, który zwraca samochód bez żadnej dodatkowej logiki
    public Car getCar() { // Getter to metoda, która odczytuje wartość zmiennej.
        return this.car;
    }

    // dodaj setter, który sprawdza, czy człowieka stać na ten samochód
    public void  setCar(Car car) {     // Setter to metoda, która aktualizuje wartość zmiennej.
        if (this.salary > car.value) { // jeśli zarobki człowieka są wyższe niż cena samochodu wypisujemy info, że udało się kupić za gotówkę i przypisujemy samochód
            System.out.println("gratulacje kupiłeś za gotówę " + car.model);
            this.car = car;
        } else  if (this.salary > car.value / 12.0) { // jeżeli zarobi są większe niż 1/12 wartości samochodu wypisujemy info, że udało się kupić na kredyt (no trudno) i przypisujemy samochód
            System.out.println("kupiłeś na kredyt " + car.model);
            this.car = car;
        } else { // w pozostałych wypadkach wypisujemy info, w stylu "zapisz się na studia i znajdź nową robotę albo idź po podwyżkę" i nie przypisujemy samochodu
            System.out.println("najpierw nazbieraj potem kupuj");
        }
    }

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return  this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("chyba cie powaliło, nie ma niewolnictwa");
        } else {
            System.out.println("nowa wypłata wysłana do systemu księgowego");
            System.out.println("odbierz aneks od pani Hani");
            System.out.println("nie ukrywaj dochodów, ZUS i US i tak cie znajdą");
            this.salary = salary;
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + age;
    }
}
