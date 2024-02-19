import java.util.Scanner;
public class example_18_03 {
    public static void main(String[] args)
    {
        int num0 = 1;
        int num1 = 1;
        int num2;
        System.out.println("Введите число членов последовательности Фибоначчи:");
        Scanner in = new Scanner(System.in);
        int num3 = in.nextInt();
        System.out.print("1 1 ");
        for (int i = 3; i <= num3; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        System.out.println();
    }
}