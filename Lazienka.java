import java.util.ArrayList;

public class Lazienka extends Pomieszczenie{
    ArrayList<Prysznic> prysznice;
    ArrayList<Wanna> wanny;
    ArrayList<Umywalka> umywalki;
    ArrayList<Pralka> pralki;
    ArrayList<Szafa> szafy;




    public Lazienka() {
        super();
        this.prysznice = new ArrayList<>();
        this.wanny = new ArrayList<>();
        this.umywalki = new ArrayList<>();
        this.pralki = new ArrayList<>();
        this.szafy = new ArrayList<>();

    }

    public void generatePrysznice(int n) {
        for (int i = 0; i < n; i++) {
            this.prysznice.add(new Prysznic());
        }
    }

    public void generateWanny(int n) {
        for (int i = 0; i < n; i++) {
            this.wanny.add(new Wanna());
        }
    }

    public void generateUmywalki(int n) {
        for (int i = 0; i < n; i++) {
            this.umywalki.add(new Umywalka());
        }
    }

    public void generatePralki(int n) {
        for (int i = 0; i < n; i++) {
            this.pralki.add(new Pralka());
        }
    }

    public void generateSzafy(int n) {
        for (int i = 0; i < n; i++) {
            this.szafy.add(new Szafa());
        }
    }

    public class Prysznic {

    }

    public class Wanna {

    }

    public class Umywalka {

    }

    public class Pralka {

    }

    public class Szafa {

    }
}
