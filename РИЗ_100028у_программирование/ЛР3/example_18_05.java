import java.util.Scanner;
public class example_18_05 {
    public static void main(String[] args)
    {   Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел num для выполнения условий num%5==2 и num%3==1:");
        int Size = id.nextInt();
        System.out.println("Размер массива чисел равен " + Size);
        int[] Nums;
        Nums = new int[Size];
        int Max = 2147483647, Num1 = 0;
        int sum = 0;
        for (int i = 0; i <= Size; i++) {
            for (Num1 = 0; Num1 <= Max; Num1++) {
                if (Num1 % 5 == 2 && Num1 % 3 == 1)
                {
                    Nums[i] = Num1;
                    sum += Nums[i];
                    System.out.println("Элемент массива [" + i + "] = " + Nums[i]);

                    Num1++;
                    i++;
                    if (i==Size) {
                        System.out.println("Сумма " + Size + " элементов массива равна: " + sum);
                    }
                }
            }
        }
    }
}