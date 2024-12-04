import java.util.ArrayList;

abstract class Pomieszczenie {
    ArrayList<Drzwi> drzwi;

    public Pomieszczenie() {
        this.drzwi = new ArrayList<>();
    }

    public void openEveryDoor(){
        for (Drzwi value : drzwi) {
            value.open();
        }
    }
    public void closeEveryDoor(){
        for (Drzwi value : drzwi) {
            value.close();
        }
    }
    public void generateDrzwi(int n, Pomieszczenie drugiePomieszczenie) {
        for (int i = 0; i < n; i++) {
            Drzwi drugaStrona = new Drzwi(null, drugiePomieszczenie);
            Drzwi noweDrzwi = new Drzwi(drugaStrona, this);
            drugaStrona.drugaStronaDrzwi = noweDrzwi;
            this.drzwi.add(noweDrzwi);
        }
    }

}
