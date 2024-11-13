public class Main {
    public static void main(String[] args) {
        Dom dom1 = new Dom(4, 4, 2, 1);

        Lazienka lazienka1 = new Lazienka();
        lazienka1.dodajPrysznic("Prysznic 1");
        lazienka1.dodajWanne("Wanna 1");
        lazienka1.dodajUmywalke("Umywalka 1");
        lazienka1.dodajPralke("Pralka 1");
        lazienka1.dodajSzafke("Szafka 1");

        Lazienka lazienka2 = new Lazienka();
        lazienka2.dodajPrysznic("Prysznic 2");
        lazienka2.dodajWanne("Wanna 2");
        lazienka2.dodajUmywalke("Umywalka 2");

        dom1.dodajLazienke(lazienka1);
        dom1.dodajLazienke(lazienka2);

        dom1.wyswietlInformacje();

        System.out.println();

        Dom dom2 = new Dom(6, 6, 4, 2);

        Lazienka lazienka3 = new Lazienka();
        lazienka3.dodajPrysznic("Prysznic 3");
        lazienka3.dodajWanne("Wanna 3");
        lazienka3.dodajUmywalke("Umywalka 3");
        lazienka3.dodajPralke("Pralka 3");
        lazienka3.dodajSzafke("Szafka 3");

        Lazienka lazienka4 = new Lazienka();
        lazienka4.dodajPrysznic("Prysznic 4");
        lazienka4.dodajWanne("Wanna 4");
        lazienka4.dodajUmywalke("Umywalka 4");


        dom2.dodajLazienke(lazienka3);
        dom2.dodajLazienke(lazienka4);

        dom2.wyswietlInformacje();
    }
}
