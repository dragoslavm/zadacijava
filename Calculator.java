public class Calculator {
    int num1;
    int num2;
    
    public Calculator (int a, int b){
        num1 = a;
        num2 = b;

    }

    public int saberi(){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator k = new Calculator(3, 4);
        int rezultat = k.saberi();

        System.out.println(rezultat);
    }
    
}
