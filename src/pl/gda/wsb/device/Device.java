package pl.gda.wsb.device;

import pl.gda.wsb.Saleable;

public abstract class Device implements Saleable {
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
        return "Awfawfawefawefawefargesrgiuehto3q87y";
    }

    public abstract void turnOn();
}
