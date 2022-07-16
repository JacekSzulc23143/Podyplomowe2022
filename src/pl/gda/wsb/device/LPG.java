package pl.gda.wsb.device;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Poproś o zatankowanie");
        System.out.println("Zapłać");
    }
}
