import java.util.jar.Attributes.Name;

public class Puppy {
    int puppyAge;

    public Puppy (String name){
        System.out.println("Izabrano ime je " + name);
    }
    
    public void setAge (int age){
        puppyAge = age;
    }
       
    public int getAge(){
        System.out.println("Stene ima godina " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy zuca = new Puppy("zuti");
        zuca.setAge(7);
        zuca.getAge();
        System.out.println("Vrednost promenljive godine je " + zuca.puppyAge);
    }

}

