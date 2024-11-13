import java.util.ArrayList;

public class Dom {
    private int drzwi;
    private int okna;
    private int pokoje;
    private int kuchnie;
    private ArrayList<Lazienka> lazienki;
    
    public Dom(int drzwi, int okna, int pokoje, int kuchnie) {
        this.drzwi = drzwi;
        this.okna = okna;
        this.pokoje = pokoje;
        this.kuchnie = kuchnie;
        this.lazienki = new ArrayList<>();
    }

    public void dodajLazienke(Lazienka lazienka) {
        lazienki.add(lazienka);
    }

    public void wyswietlInformacje() {
        System.out.println("Dom ma:");
        System.out.println("- " + drzwi + " drzwi");
        System.out.println("- " + okna + " okna");
        System.out.println("- " + pokoje + " pokoje");
        System.out.println("- " + kuchnie + " kuchnie");
        System.out.println("- " + lazienki.size() + " łazienki");


        for (int i = 0; i < lazienki.size(); i++) {
            System.out.println("Łazienka " + (i + 1) + ":");
            lazienki.get(i).wyswietlInformacje();
        }
    }
}
