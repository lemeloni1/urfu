import java.util.Scanner;
public class example_18_02 {
    private static char First;
    private static char Second;
    public static void Third () {
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите первый символ: ");
        First = InCMD.next().charAt(0);
        System.out.print("Введите второй символ: ");
        Second = InCMD.next().charAt(0);
        System.out.println("---");
        for (int i = (int) First; i<= (int) Second; i++ ) {
            System.out.println("Символ = " + (char) i );
        }
    }
    public static void main(String[] args) {
        Third ();
    }

}
