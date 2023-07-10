import java.util.Scanner;
public class Utils {
    static Scanner scanner = new Scanner(System.in);
    public static String readString(){
        String input = scanner.nextLine();
        /*
        Fenster öffnet sich und man kann reinschreben bis ENTER gedrück wird
        Dann wird die Eingabe eingelesen
        ACHTUNG! nur für String verwendbar,
        wenn man int oder Double einlesen will muss nextInt() bzw. nextDouble verwendet werden
         */
        return input;
    }
}
