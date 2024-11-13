import java.util.ArrayList;

public class Lazienka {
    private ArrayList<String> prysznice;
    private ArrayList<String> wanny;
    private ArrayList<String> umywalki;
    private ArrayList<String> pralki;
    private ArrayList<String> szafki;

    public Lazienka() {
        prysznice = new ArrayList<>();
        wanny = new ArrayList<>();
        umywalki = new ArrayList<>();
        pralki = new ArrayList<>();
        szafki = new ArrayList<>();
    }

    public void dodajPrysznic(String prysznic) {
        prysznice.add(prysznic);
    }

    public void dodajWanne(String wanna) {
        wanny.add(wanna);
    }

    public void dodajUmywalke(String umywalka) {
        umywalki.add(umywalka);
    }

    public void dodajPralke(String pralka) {
        pralki.add(pralka);
    }

    public void dodajSzafke(String szafka) {
        szafki.add(szafka);
    }

    public void wyswietlInformacje() {
        System.out.println("Łazienka zawiera:");
        System.out.println(prysznice.size() + " pryszniców.");
        System.out.println(wanny.size() + " wanny.");
        System.out.println(umywalki.size() + " umywalki.");
        System.out.println(pralki.size() + " pralki.");
        System.out.println(szafki.size() + " szafki.");
    }
}
