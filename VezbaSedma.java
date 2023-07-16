import java.util.Scanner;

public class VezbaSedma {

    char ocena;
    public static void main(String[] args) {

        char ocena;
        
        Scanner console = new Scanner(System.in);

        System.out.println("Unesite ocenu: ");
        ocena = console.next().charAt(0);

        switch (ocena){
        case 'A':
        System.out.println("Excellent");
        break;
        case 'B':
        System.out.println("Good");
        break;
        case 'C':
        System.out.println("Average");
        break;
        case 'D':
        System.out.println("Deficient");
        break;
        case 'F':
        System.out.println("Failing");
        break;
        default:
        System.out.println("Ocena nije validna");
        }


    }
}
