package pl.gda.wsb.creatures;

import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Phone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Human extends Animal {
    public String firstName;
    public String lastName;

    public Phone mobile;
    public Animal pet;
    public Car[] garage; // Zadanie 11 pkt 1.
    private static final Integer DEFAULT_GARAGE_SIZE = 3; // Zadanie 11 pkt 2.
    private Double salary;
    public Double cash;

    // Zadanie 11 pkt 2. Popraw konstruktor w Human tak, aby nowo utworzony człowiek posiadał garaż z domyślną liczą
    // pojazdów.
    public Human() {
        super("homo sapiens");
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    // Zadanie 11 pkt 3. Dodaj nowy konstruktor w którym rozmiar garażu będzie (kolejnym?) parametrem.
    public Human(Integer garageSize) {
        super("homo sapiens");
        this.cash = 0.0;
        this.garage = new Car[garageSize];
    }

    // Zadanie 11 pkt 4. Popraw metody getCar i setCar, żeby przyjmowały jako parametr numer miejsca parkingowego w
    // garażu z którego ma być pobrany samochód lub na które ma być wstawiony samochód.
    public Car getCar(Integer parkingPlaceNumber) {
        return this.garage[parkingPlaceNumber];
    }

    public void setCar(Car car, Integer parkingPlaceNumber) {
        this.garage[parkingPlaceNumber] = car;
    }

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return this.salary;
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

    // przesłonięta metoda z Animal
    @Override
    public void takeForAWalk() {
        System.out.println("Inne wyprowadzanie na spacer");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile=" + mobile +
                ", pet=" + pet +
                ", garage=" + garage +
                '}';
    }

    // Zadanie 11 pkt 5. Utwórz metodę, która zwraca sumę wartości pojazdów w garażu. Pole Double value powinno
    // znajdować się w klasie Device.
    public Double getGarageValue() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car.value != null) {
                value += car.value;
            }
        }
        System.out.println("Wartość pojazdów w garażu:");
        return value;
    }

    // Zadanie 11 pkt 6. Utwórz metodę sortującą samochody w garażu po roku produkcji od najstarszych do najmłodszych.
    public List<Car> sortGarage() {
        return Arrays.stream(garage)
                .sorted(Comparator.comparing(car -> car.yearOfProduction))
                .collect(Collectors.toList());
    }

    // Zadanie 11 pkt 7.
    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar)
                return true;
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for (Car car : garage) {
            if (car == null)
                return true;
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == carToRemove)
                garage[i] = null;
        }
    }

    public void addCar(Car newCar) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null)
                garage[i] = newCar;
                newCar.owners.add(this);
            return;
        }
    }
}
