package pl.gda.wsb.device;

import jdk.jshell.spi.ExecutionControl;
import pl.gda.wsb.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Rechargeable {
    static final String DEFAULT_APP_VERSION = "latest";
    static final String DEFAULT_SERVER_ADDRESS = "play.store.com";
    private static final Integer DEFAULT_PORT_NUMBER = 443;
    private static final String DEFAULT_PROTOCOL = "https";

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

    // Do wyjaśnienia
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");

//        if (seller.mobile != this) {
//            throw new Exception("Sprzedawca nie ma telefonu");
//        }
//        if (buyer.cash < price) {
//            throw new Exception("Kupujący nie ma kasy");
//        }
//
//        buyer.cash -= price;
//        seller.cash += price;
//        buyer.mobile = this;
//        seller.mobile = null;
//        System.out.println("Sprzedano telefon");
    }

    // lista nazw aplikacji do zainstalowania
    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    // nazwa aplikacji do zainstalowania
    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
        System.out.println();
    }

    // nazwę i wersję
    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    // obiekt kasy URL, który powinien odwoływać się do konkretnej aplikacji w konkretnej wersji na konkretnym
    //serwerze
    public void installAnApp(String appName, String version, String server) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, server, DEFAULT_PORT_NUMBER, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    // nazwa, wersja i adres serwera, url
    public void installAnApp(URL url) {
        System.out.println("Sprawdź czy jest miejsce");
        System.out.println("Sprawdź blokadę rodzicielską");
        System.out.println("Sprawdź czy jest płatna");
        System.out.println("jeżeli tak obsłuż płatność");
        System.out.println("pobierz");
        System.out.println("rozpakuj (unzip)");
        System.out.println("zainstaluj");
        System.out.println("udało się zainstalować " + url.getFile() + " z serwera " + url.getHost());
    }

    // przesłonięta metoda z Device
    @Override
    public String toString() {
        return "Elo, niezły telefon";
    }
}