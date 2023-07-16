import java.util.Scanner;
public class VezbaSesta {
    public static void main(String[] args) {
        int ocena1, ocena2, ocena3;
        double prosek;
        char ocena;
        Scanner console = new Scanner(System.in);

        System.out.println("Unesi ocenu iz prvog predmeta");
        ocena1 = console.nextInt();

        System.out.println("Unesi ocenu iz drugog predmeta");
        ocena2 = console.nextInt();

        System.out.println("Unesi ocenu iz treceg predmeta");
        ocena3 = console.nextInt();

        prosek = (ocena1 + ocena2 + ocena3) / 3.0;

        if (prosek >= 90){
            ocena = 'A';
        }
        else if (prosek >= 80){
            ocena = 'B';
        }
        else if (prosek >= 70){
            ocena = 'C';
        }
        else if (prosek >= 60){
            ocena = 'D';
        }
        else{
            ocena = 'F';
        }
        System.out.println("Ocena je: " + ocena);


    }
    
}
