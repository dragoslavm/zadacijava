public class SwitchStatement {
    
    public static void main (String [] args){
        char ocena = 'h';

        switch(ocena){
            case 'A' :
            System.out.println("Odlican 5, svaka cast");
            break;

            case 'B' :
            System.out.println("Vrlo dobar 4, bravo");
            break;

            case 'C' :
            System.out.println("Dobar 3, moze bolje");
            break;

            case 'D' :
            System.out.println("Dovoljan 2, vise se potrudi");
            break;

            default :
            System.out.println("Lose uneta ocena");
        }
    }
}
