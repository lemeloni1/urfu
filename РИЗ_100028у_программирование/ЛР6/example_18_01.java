import java.util.Scanner;
public class example_18_01 {
    public static void main(String[] args)
    {
        Test1 T1 = new Test1();
        T1.SET(inputChar());
        T1.SET(inputString());
        T1.SET(arrayChar());
    }
    public static String inputString()
    {
        Scanner input_value = new Scanner(System.in);
        System.out.println("Введите строку: ");
        var value = input_value.next();
        return value;
    }
    public static char inputChar()
    {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Введите символ: ");
        var value = input_value.next();
        return value.charAt(0);
    }
    public static char[] arrayChar()
    {
        var value = inputString();
        return value.toCharArray();
    }
}
class Test1 {
    private char c = 0;
    private String d = "0";

    void SET(char i) {
        c = i;
        System.out.println("Символьное поле: " + c);
    }

    void SET(String i) {
        d = i;
        System.out.println("Строковое поле: " + d);
    }
    void SET(char[] maschar){
        if(maschar.length != 0) c = maschar[0];
        else d = String.valueOf(maschar);
        System.out.println("Символьное поле: " + c + " Строковое поле: " + d);
    }
}