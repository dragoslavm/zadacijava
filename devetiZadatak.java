public class devetiZadatak {
 public static void main(String args[]) {
    String [] imena = {"Mila", "Nikola", "Milos", "Ana"};
    String najduzeIme = "";

    for (String ime : imena){
        if(ime.lenght() > najduzeIme.lenght()){
            najduzeIme = ime;
        }
    }
    System.out.println(najduzeIme);
 }   
    
}
