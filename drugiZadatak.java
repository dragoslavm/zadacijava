import java.util.Scanner;
public class drugiZadatak {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
 
        System.out.println("Unesite prvi broj (<100): ");
        int x = in.nextInt();
        System.out.println("Unesite drugi broj (>100): ");
        int y = in.nextInt();

        if(x < 100) {
            if( y >100){
                System.out.println("True");
            }
            else{
                System.out.println("False");

            }
        }
        else{
            System.out.println("False");

        }
    
    }
}