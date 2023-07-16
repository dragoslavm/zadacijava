import java.util.Scanner;
public class treciZadatak {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
 
        System.out.println("Unesite vrednost x");
        int x = in.nextInt();
        System.out.println("Unesite vrednost y");
        int y = in.nextInt();

        if (x < y) {
            System.out.println(x + y);
        }
        else  if(x > y) {
            System.out.println(x - y);
        }
        else{
            System.out.println(x * y);
        }
}
}