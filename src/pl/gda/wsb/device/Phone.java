package pl.gda.wsb.device;

public class Phone extends Device implements Rechargeable{
    public Double screenSize;
    public String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("o! jest logo, jednak działa");
    }

    @Override
    public void recharge() {
        System.out.println("znajdź ładowarkę");
        System.out.println("znajdź wolne gniazdko");
        System.out.println("podłącz");
        System.out.println("czekaj");
        System.out.println("czekaj nadal");
        System.out.println("czekaj");
        System.out.println("tak, ciągle czekaj");
    }
}