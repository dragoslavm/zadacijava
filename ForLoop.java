public class ForLoop {

    public static void main (String [] args) {

        for (int x = 1 ; x<=10 ; x = x+1){
            if (x%2 == 0) {
                System.out.println("Vrednost parne x je " + x);

            }
            else {
                System.out.println("Vrednost neparnog x je " + x);

            }
        }
        System.out.println("kraj petlje");

    }
    
}
