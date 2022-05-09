package pl.gda.wsb.device;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    // konstruktor
    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "sdfgswegsdfgsdfgsdfgsdgfds";
    }

    public abstract void turnOn();
}
