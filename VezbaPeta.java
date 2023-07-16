import java.util.Scanner;

public class VezbaPeta {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);

    int broj;
 
        System.out.println("Unesite broj: ");
        broj = in.nextInt();

        if (broj > 0){
            System.out.println("Broj je pozitivan");
        }
        else if (broj < 0){
            System.out.println("Broj je negativan");
        }
        else {
            System.out.println("Broj je nula");
        } 
    }
}