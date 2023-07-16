public class Pravougaonik {
    int duzina;
    int visina;

    public Pravougaonik(int a, int b){
        duzina = a;
        visina = b;
    }
public int izracunajPovrsinu(){
    return duzina * visina;
}

public int izracunajObim(){
    return 2*(duzina + visina);
}

public static void main(String[] args) {
    Pravougaonik PrviPravougaonik = new Pravougaonik(3, 7);
    Pravougaonik DrugiPravouganoik = new Pravougaonik(2, 3);

    int Povrsina1 = PrviPravougaonik.izracunajPovrsinu();
    int Obim1 = PrviPravougaonik.izracunajObim();

    int Povrsina2 = DrugiPravouganoik.izracunajPovrsinu();
    int Obim2 = DrugiPravouganoik.izracunajObim();

    System.out.println("Povrsina prvog pravougaonika je " + Povrsina1 + "dok mu je obim" + Obim1);
    System.out.println("Povrsina drugog pravougaonika je " + Povrsina2 + "dok mu je obim" + Obim2);

}




}
