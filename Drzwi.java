public class Drzwi {
    Pomieszczenie obecnePomieszczenie;
    Drzwi drugaStronaDrzwi;
    boolean isOpen;

    public Drzwi(Drzwi drugieDrzwi, Pomieszczenie obecnePomieszczenie) {
        this.drugaStronaDrzwi = drugieDrzwi;
        this.obecnePomieszczenie = obecnePomieszczenie;
    }

    public void gdzieProwadzaDrzwi() {
        if (drugaStronaDrzwi != null && drugaStronaDrzwi.obecnePomieszczenie != null) {
            System.out.println(obecnePomieszczenie + " ---> " + drugaStronaDrzwi.obecnePomieszczenie);
        } else {
            System.out.println("Drzwi nie prowadzą nigdzie.");
        }
    }


    public void open() {
        isOpen = true;
        System.out.println("Otwarto drzwi");
    }

    public void close() {
        isOpen = false;
        System.out.println("Zamknięto drzwi");
    }

}
