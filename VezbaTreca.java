import java.util.Scanner;
public class VezbaTreca {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
 
        System.out.println("Unesite vrednost x: ");
        int x = in.nextInt();
    

    if (x % 2 == 0){
        System.out.println("Broj je paran");
    }
    else{
        System.out.println("Broj je neparan");
    }
    

    }
    
}
