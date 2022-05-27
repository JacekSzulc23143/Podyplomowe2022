package pl.gda.wsb.device;

public class Electric extends Car {
    public Electric(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Podłączam do gniazdka");
        System.out.println("Idę spać do domu");
    }
}
