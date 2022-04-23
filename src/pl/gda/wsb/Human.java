package pl.gda.wsb;

public class Human {
    String firstName; // kolejno typ zmiennej i nazwa zmiennej
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    private Car car;
    private Double salary;

    public  Car getCar() {
        return this.car;
    }

    public void  setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("gratulacje kupiłeś za gotówę " + car.model);
            this.car = car;
        } else  if (this.salary > car.value / 12.0) {
            System.out.println("kupiłeś na kredyt " + car.model);
            this.car = car;
        } else {
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
}
