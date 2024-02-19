import java.util.Scanner;
public class example_18_06
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Введите целое число num для выполнения условия num%5==2:: ");
            int Size = scanner.nextInt();
            if (Size <= 0)
                System.out.println("Некорректный ввод!Ошибка!Введите именно целое положительное число:");
            System.out.println("Размер массива чисел равен " + Size);
            int[] Nums;
            Nums = new int[Size];
            int Max = 2147483647, Num1;
            int i = 0;
            while (i <= Size) {
                for (Num1 = 7; Num1 <= Max; Num1++) {
                    if (Num1 % 5 == 2)
                    {
                        Nums[i] = Num1;
                        System.out.println("Элемент массива [" + i + "] = " + Nums[i]);
                        Num1++;
                        i++;
                    }
                }
            }

        }
    }
}
