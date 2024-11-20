import java.util.ArrayList;

public abstract class Pomieszczenie {
    ArrayList<Drzwi> drzwi;  // A list of doors in the room

    public Pomieszczenie() {
        this.drzwi = new ArrayList<>();
    }

    public void createDoors(int n) {
        for (int i = 0; i < n; i++) {
            this.drzwi.add(new Drzwi());
        }
    }

    public void openDoors() {
        for (Drzwi drzwi : this.drzwi) {
            drzwi.open();
        }
    }
}
