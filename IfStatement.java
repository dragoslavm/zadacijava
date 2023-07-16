import javax.sql.rowset.spi.SyncResolver;

public class IfStatement{
    
    public static void main (String [] args){
        int broj = 11;
        int drugiBroj = 1;
        if (broj == 11){
            if (drugiBroj == 10){
                System.out.println("Prvi broj je 11, a drugi broj je 10");
    }
    else{
        System.out.println("Drugi broj je razlicit od 10, a prvi broj je 11");
    }
}
    else{
        System.out.println("Broj je razlicit od 11");
}
        System.out.println("Uvek");
}
   

    }
