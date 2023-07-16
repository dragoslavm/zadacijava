public class WhileLoop {
    public static void main(String [] args){
        int x = 10;
        while(x<=20){
            if (x%2 == 0){
                System.out.println("Vrednost parnog broja x je " +x);
            }
            else{
                System.out.println("Vrednost neparnog broja x je " + x);

            }
        x = x+1;
        }
        System.out.println("Kraj petlje");

    }
    
}
