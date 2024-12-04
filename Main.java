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

        Kuchnia kuchnia = new Kuchnia();

        Pokoj pokoj = new Pokoj();
        Pokoj pokoj2 = new Pokoj();
        Pokoj pokoj3 = new Pokoj();
        Korytarz korytarz = new Korytarz();
        Korytarz korytarz2 = new Korytarz();
        Korytarz korytarz3 = new Korytarz();
        Korytarz korytarz4 = new Korytarz();
        Korytarz korytarz5 = new Korytarz();


        pokoj.generateDrzwi(1, korytarz);
        korytarz.generateDrzwi(1,kuchnia);
        kuchnia.generateDrzwi(1,korytarz2);
        korytarz2.generateDrzwi(1,lazienka1);
        lazienka1.generateDrzwi(1,korytarz3);
        korytarz3.generateDrzwi(1,lazienka2);
        lazienka2.generateDrzwi(1,korytarz4);
        korytarz4.generateDrzwi(1,pokoj2);
        pokoj2.generateDrzwi(1,pokoj3);
        korytarz5.generateDrzwi(0,null);



        kuchnia.drzwi.get(0).drugaStronaDrzwi = korytarz.drzwi.get(0);


       /*
        lazienka1.openEveryDoor();
        kuchnia.openEveryDoor();
        dom1.openEveryDoor();
        pokoj.openEveryDoor();

        lazienka1.closeEveryDoor();
        kuchnia.closeEveryDoor();
        dom1.closeEveryDoor();
        pokoj.closeEveryDoor();*/


        pokoj.drzwi.get(0).gdzieProwadzaDrzwi();
        korytarz.drzwi.get(0).gdzieProwadzaDrzwi();
        kuchnia.drzwi.get(0).gdzieProwadzaDrzwi();
        korytarz2.drzwi.get(0).gdzieProwadzaDrzwi();
        lazienka1.drzwi.get(0).gdzieProwadzaDrzwi();
        korytarz3.drzwi.get(0).gdzieProwadzaDrzwi();
        lazienka2.drzwi.get(0).gdzieProwadzaDrzwi();
        korytarz4.drzwi.get(0).gdzieProwadzaDrzwi();
        pokoj2.drzwi.get(0).gdzieProwadzaDrzwi();
        korytarz5.drzwi.get(0).gdzieProwadzaDrzwi();




    }
}
