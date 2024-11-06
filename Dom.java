import java.util.ArrayList;

public class Dom {

int liczbaOkien,liczbaPokoi,liczbaKuchni,liczbaLazienek,liczbaDrzwi;

    ArrayList<Drzwi> drzwi = new ArrayList<Drzwi>();
    ArrayList<Kuchnia> kuchnia = new ArrayList<Kuchnia>();
    ArrayList<Lazienka> lazienka = new ArrayList<Lazienka>();
    ArrayList<Okno> okno = new ArrayList<Okno>();
    ArrayList<Pokoj> pokoj = new ArrayList<Pokoj>();

    public Dom() {

    }

    public void ustawLiczbeDrzwi(int liczbaDrzwi){
    this.liczbaDrzwi=liczbaDrzwi;
}
    public void ustawLiczbeKuchni(int liczbaKuchni){
        this.liczbaKuchni=liczbaKuchni;
    }
    public void ustawLiczbeLazienek(int liczbaLazienek){
        this.liczbaLazienek=liczbaLazienek;
    }
    public void ustawLiczbeOkien(int liczbaOkien){
        this.liczbaOkien=liczbaOkien;
    }
    public void ustawLiczbePokoi(int liczbaPokoi){
        this.liczbaPokoi = liczbaPokoi;
    }

    public void informacjeODomie(){
        System.out.println("Liczba drzwi: "+liczbaDrzwi);
        System.out.println("Liczba kuchni: "+liczbaKuchni);
        System.out.println("Liczba lazienek: "+liczbaLazienek);
        System.out.println("Liczba okien: "+liczbaOkien);
        System.out.println("Liczba pokoi: "+liczbaPokoi);
    }

    public Dom(int liczbaOkien, ArrayList<Drzwi> drzwi, ArrayList<Kuchnia> kuchnia, ArrayList<Lazienka> lazienka, ArrayList<Okno> okno, ArrayList<Pokoj> pokoj) {
        this.liczbaOkien = liczbaOkien;
        this.drzwi = drzwi;
        this.kuchnia = kuchnia;
        this.lazienka = lazienka;
        this.okno = okno;
        this.pokoj = pokoj;
    }
    public void generuj(){
        Dom dom = new Dom();
        dom.ustawLiczbeDrzwi(1);
        dom.ustawLiczbeKuchni(1);
        dom.ustawLiczbeLazienek(1);
        dom.ustawLiczbeOkien(4);
        dom.ustawLiczbePokoi(2);
        System.out.println("Liczba drzwi: "+liczbaDrzwi);
        System.out.println("Liczba kuchni: "+liczbaKuchni);
        System.out.println("Liczba lazienek: "+liczbaLazienek);
        System.out.println("Liczba okien: "+liczbaOkien);
        System.out.println("Liczba pokoi: "+liczbaPokoi);
    }
}
