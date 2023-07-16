import java.util.Scanner;
public class InfoKlasa {
    private String ime;
    private String prezime;


    public void uzmiPodatke(){
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite svoje ime: ");
        ime = in.nextLine();

        System.out.println("Unesite svoje prezime: ");
        prezime = in.nextLine();
    
    }

    public void ispisiPodatke(){
        System.out.println("Vase ime je: " + ime);
        System.out.println("Vase prezime je: " + prezime);
    }

    public static void main(String[] args) {
        InfoKlasa c1 = new InfoKlasa();
        c1.uzmiPodatke();
        c1.ispisiPodatke();
    }
    
}
