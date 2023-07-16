public class MyClass {
    static void statickaMetoda(){
        System.out.println("Staticka metoda se moze pozvati bez kreiranja objekta");
    }
    
    public void neStatickaMetoda(){
        System.out.println("Nestaticka metoda se mora pozvati preko objekta");
    }

    public static void main(String[] args) {
        statickaMetoda();
        
        MyClass mojObjekat = new MyClass();
        mojObjekat.neStatickaMetoda();
    }
}
