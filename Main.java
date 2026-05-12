
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
        int oG = 10;
        for(int i = 0; i <= oG; i++)
        {
            summe += i;
        }
        
        int mult = 1;
        for(int i = 1; i <= oG; i++)
        {
            mult *= i;
        }
        
        System.out.println("Summe= " + summe);
        System.out.println("Mult= " + mult);
    }
}
