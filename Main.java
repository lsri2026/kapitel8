
import java.math.BigInteger;

/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main()
    {
        int summe = 0;

        int obereGrenze = 50;
        
        for(int i = 0; i <= obereGrenze; i++)

        {
            summe += i;
        }
        

        BigInteger mult = new BigInteger("1");

        for(int i = 1; i <= obereGrenze; i++)

        {
            BigInteger tmp = new BigInteger(String.valueOf(i));
            mult = mult.multiply(tmp);
        }
        
        System.out.println("Summe= " + summe);
        System.out.println("Mult= " + mult);
        
        // coole Idee 1
        
        // coole Idee ...

        
        //Master/Feature Update 1
        
        // Master/Feature Update 2


    }
}
