import java.util.Scanner;
public class VezbaCetvrta {
    public static void main(String[] args) {

        int broj1, broj2, broj3;
        int najveci;
        Scanner in = new Scanner(System.in);
 
        System.out.println("Unesite prvi broj");
        broj1 = in.nextInt();
        System.out.println("Unesite drugi broj");
        broj2 = in.nextInt();
        System.out.println("Unesite treci broj");
        broj3 = in.nextInt();
        
        

        if (broj1 > broj2 && broj1 > broj3){
            najveci = broj1;
        }
        else if (broj2 > broj3){
            najveci = broj2;
        }
        else{
            najveci = broj3;

        } 
        System.out.println("Najveci broj je " + najveci);
    }
    
}
