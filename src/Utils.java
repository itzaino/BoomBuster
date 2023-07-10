import java.util.Scanner;
public class Utils {
    static Scanner scanner = new Scanner(System.in);
    public static String readString(){
        /*
        Fenster öffnet sich und man kann reinschreiben bis ENTER gedrückt wird
        dann wird die Eingabe eingelesen
        ACHTUNG! nur für String verwendbar,
        wenn man int oder Double einlesen will, muss nextInt() bzw. nextDouble verwendet werden
         */
        return scanner.nextLine();
    }
}
