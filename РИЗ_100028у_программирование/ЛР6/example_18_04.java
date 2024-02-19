import java.util.Scanner;
public class example_18_04 {
    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение вычисляемого двойного факториала: ");
        var getValue = Test4.doubleFactorial(scanner.nextInt());
        System.out.println("Размер вычисляемого двойного факториала: " + getValue);
    }
}
class Test4
{
    public static int doubleFactorial(int valueFactorial) {
        int fact = 1;
        while (valueFactorial >= 1) {
            fact *= valueFactorial;
            valueFactorial -= 2;
        }
        return fact;
    }
}