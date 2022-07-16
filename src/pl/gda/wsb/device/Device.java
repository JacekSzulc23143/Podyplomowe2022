package pl.gda.wsb.device;

import pl.gda.wsb.Saleable;

public abstract class Device implements Saleable {
    final public String producer;
    final public String model;
    public Integer yearOfProduction;
    public Double value;

    // konstruktor
    public Device(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

//    public String toString() {
//        return "Awfawfawefawefawefargesrgiuehto3q87y";
//    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }

    public abstract void turnOn();
}
