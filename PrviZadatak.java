import java.util.Scanner;
public class PrviZadatak {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
 
        System.out.println("Unesite vrednost x");
        int x = in.nextInt();
        System.out.println("Unesite vrednost y");
        int y = in.nextInt();

        if (x > y) {
            System.out.println("Veci je broj: " + x);
        } else if (x < y) {
            System.out.println("Veci je broj: " + y);
        } else {
            System.out.println("Brojevi su jednaki" );
        }
    
}
}