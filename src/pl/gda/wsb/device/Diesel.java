package pl.gda.wsb.device;

public class Diesel extends Car {
    public Diesel(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Zapłacz");
        System.out.println("Zatankuj");
        System.out.println("Zapłać");
        System.out.println("Zapłacz ponownie");
    }
}
