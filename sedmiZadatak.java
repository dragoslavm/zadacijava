import java.util.Scanner;
public class sedmiZadatak {
    public static void main (string [] args){
       int [] numbers = { 1, 2, 3, 5, 5, 5, 3, 2, 2, 2, 1, 1, 1, 1 };
       int broj = 0
       
       System.out.println("Unesite prvi broj od 1 do 5: ");
       Scanner in = new Scanner(System.in);
       int y = in.nextInt();

       for(int x : numbers){
        if(x == y){
            broj = broj + 1;
        }
       }
       System.out.println(broj);
    }
}
