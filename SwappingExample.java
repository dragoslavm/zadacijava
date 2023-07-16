public class SwappingExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Pre zamene, a= " + a + " i b= " + b);

        swapFunction(a, b);
        System.out.println("Pre i posle zamene vrednosti ostaju iste");
        System.out.println("Nakon zamene, a= "+ a + " i b= " + b);
    }
        public static void swapFunction(int a, int b){
            System.out.println("Pre zamene unutar funkcije, a= "+ a + " i b= " + b);
            int c = a;
            a = b;
            b = c;
            System.out.println("Nakon zamene unutar funkcije, a= "+ a + " i b= " + b);
        }
    
}
