import java.util.ArrayList;

public class Dom extends Pomieszczenie {
    ArrayList<Lazienka> lazienki;
    ArrayList<Kuchnia> kuchnie;
    ArrayList<Okno> okna;
    ArrayList<Pokoj> pokoje;

    public Dom() {
        super(); //Wywolanie konstruktora z pomieszczenia
        this.lazienki = new ArrayList<>();
        this.kuchnie = new ArrayList<>();
        this.okna = new ArrayList<>();
        this.pokoje = new ArrayList<>();
    }

    public void createRooms(int n) {
        for (int i = 0; i < n; i++) {
            this.pokoje.add(new Pokoj());
        }
    }

    public void createKitchens(int n) {
        for (int i = 0; i < n; i++) {
            this.kuchnie.add(new Kuchnia());
        }
    }

    public void createWindows(int n) {
        for (int i = 0; i < n; i++) {
            this.okna.add(new Okno());
        }
    }

    public void createBathrooms(int n) {
        for (int i = 0; i < n; i++) {
            this.lazienki.add(new Lazienka());
        }
    }
}
