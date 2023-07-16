public class EnhancedForLoop {

    public static void main (String [] args) {

        int [] brojevi = {10, 20, 30, 40, 50};

        for (int broj : brojevi){
            System.out.println(broj);
        }
        System.out.println("Svi brojevi su tu");

        String [] imena = {"Nemanja", "Ivan", "Stefan", "Aleksandra", "Biljana"};
        for (String ime : imena){
            System.out.println(ime);
        }
        System.out.println("Sva imena su tu");
    }
    
}
