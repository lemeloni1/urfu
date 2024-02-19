import java.util.Scanner;
public class example_18_01 {
    private static char First;

    private static void InChar (){

        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите строку: ");
        First = InCMD.next().charAt(0);
        System.out.println("Символ = " + First);
    }
    private static int Second() {
        return (int) First;
    }

    public static void main(String[] args) {
        InChar();
        System.out.println("Код символа = " + Second());
    }
}
