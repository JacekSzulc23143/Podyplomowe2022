package pl.gda.wsb.device;

public abstract class Device {

    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

//    public final String model;    // informacja tekstowa
//    final String producer; // informacja tekstowa


    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "sdfgswegsdfgsdfgsdfgsdgfds";
    }

    public abstract void turnOf();
    //
}
