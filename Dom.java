import java.util.ArrayList;

public class Dom extends Pomieszczenie{
    ArrayList<Lazienka> lazienki;
    ArrayList<Kuchnia> kuchnie;
    ArrayList<Okno> okna;
    ArrayList<Pokoj> pokoje;

    public Dom() {
        super();
        this.lazienki = new ArrayList<>();
        this.kuchnie = new ArrayList<>();
        this.okna = new ArrayList<>();
        this.pokoje = new ArrayList<>();
    }

    public void generateLazienki(int n){
        for(int i = 0; i < n; i++){
            this.lazienki.add(new Lazienka());
        }
    }
    public void generateKuchnie(int n){
        for(int i = 0; i < n; i++){
            this.kuchnie.add(new Kuchnia());
        }
    }
    public void generateOkna(int n){
        for(int i = 0; i < n; i++){
            this.okna.add(new Okno());
        }
    }
    public void generatePokoje(int n){
        for(int i = 0; i < n; i++){
            this.pokoje.add(new Pokoj());
        }
    }
}
