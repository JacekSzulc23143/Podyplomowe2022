package pl.gda.wsb.device;

public class Electric extends Car {
    public Electric(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Podłączam do gniazdka");
        System.out.println("Idę spać do domu");
    }
}
