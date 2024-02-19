import java.util.Scanner;
public class example_18_05 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления суммы квадратов натуральных чисел: ");
        var result = Test5.powValue(scanner.nextInt());
        System.out.println("Результат вычисления суммы квадратов натуральных чисел: " + result);
    }
}
class Test5
{ static int powValue(int n)
{ int result = 0;
    for( int i = 0; i <= n; i++)
    {
        result += Math.pow(i,2);
    }
    return result;
}}
