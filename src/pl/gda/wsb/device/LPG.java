package pl.gda.wsb.device;

public class LPG extends Car {
    public LPG(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Poproś o zatankowanie");
        System.out.println("Zapłać");
    }
}
