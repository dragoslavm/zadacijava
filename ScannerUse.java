import java.util.Scanner;

public class ScannerUse {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
 
        System.out.println("Unesite vrednost x");
        int x = in.nextInt();
        System.out.println("Unesite vrednost y");
        int y = in.nextInt();
        System.out.println("Vrednost broja x je " +x);
        System.out.println("Vrednost broja x je " +y);
        int z = x + y;
        System.out.println ("Vrednost broja z je" +z);

    }
    
}
