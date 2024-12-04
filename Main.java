public class Main {
    public static void main(String[] args) {
        Dom dom1 = new Dom();
        Dom dom2 = new Dom();

        dom1.generateLazienki(1);
        dom1.generateDrzwi(1, new Dom());
        dom1.generateOkna(4);
        dom1.generateKuchnie(1);
        dom1.generatePokoje(2);

        dom2.generateLazienki(2);
        dom2.generateDrzwi(1, new Dom());
        dom2.generateOkna(20);
        dom2.generateKuchnie(1);
        dom2.generatePokoje(15);

        Lazienka lazienka1 = new Lazienka();
        Lazienka lazienka2 = new Lazienka();

        lazienka1.generatePrysznice(1);
        lazienka1.generateWanny(1);
        lazienka1.generateUmywalki(1);
        lazienka1.generatePralki(1);
        lazienka1.generateSzafy(1);

        lazienka2.generatePrysznice(1);
        lazienka2.generateWanny(1);
        lazienka2.generateUmywalki(1);
        lazienka2.generatePralki(1);
        lazienka2.generateSzafy(1);

        lazienka1.generateDrzwi(1, null);

        Kuchnia kuchnia = new Kuchnia();
        kuchnia.generateDrzwi(1, lazienka1);

        Pokoj pokoj = new Pokoj();
        Pokoj pokoj2 = new Pokoj();
        pokoj.generateDrzwi(1, lazienka1);

        // Ustawienie wzajemnego połączenia drzwi
        pokoj.drzwi.get(0).drugaStronaDrzwi = kuchnia.drzwi.get(0);
        kuchnia.drzwi.get(0).drugaStronaDrzwi = lazienka1.drzwi.get(0);
        lazienka1.drzwi.get(0).drugaStronaDrzwi = lazienka1.drzwi.get(0);

       /* // Otwieranie drzwi w poszczególnych pomieszczeniach
        lazienka1.openEveryDoor();
        kuchnia.openEveryDoor();
        dom1.openEveryDoor();
        pokoj.openEveryDoor();

        // Zamykanie drzwi w poszczególnych pomieszczeniach
        lazienka1.closeEveryDoor();
        kuchnia.closeEveryDoor();
        dom1.closeEveryDoor();
        pokoj.closeEveryDoor();*/

        // Sprawdzanie, gdzie prowadzą drzwi
        pokoj.drzwi.get(0).gdzieProwadzaDrzwi();
        kuchnia.drzwi.get(0).gdzieProwadzaDrzwi();
        lazienka1.drzwi.get(0).gdzieProwadzaDrzwi();



    }
}
