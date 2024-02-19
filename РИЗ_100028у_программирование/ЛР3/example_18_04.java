import java.util.Scanner;
public class example_18_04 {
    public static void main(String[] args)
    {
        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Введите второе число число:");
        int num2 = in.nextInt();
        int Size;
        if (num1 > num2)
            Size = num1 - num2 + 1;
        else
            Size = num2 - num1 + 1;
        System.out.printf("Число целых чисел для массива: %d \n", +Size);
        int Nums[] ;
        Nums = new int[Size];
        for (int i = 0; i <=Size; i++) {
            if (num1 > num2)
            {
                Nums[i] = num2++;
                System.out.println("Элемент массива ["+i+"] = " + Nums[i]);
                num1++;//

            }
            else if (num2 > num1)
            {
                Nums[i] = num1++;
                System.out.println("Элемент массива ["+i+"] = " + Nums[i]);
                num2++;

            }
        }
    }
}