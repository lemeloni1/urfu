import java.util.Scanner;
import java.util.Arrays;
public class example_18_06 {
    public static void main(String[] args) {

        Scanner InCMD = new Scanner(System.in);
        System.out.println("Введите количество столбцов: ");
        int Str = InCMD.nextInt();
        System.out.println("Введите количество строк: " );
        int Clm = InCMD.nextInt();

        int del_Clm = (int) (Math.random() * (Clm + 1));
        del_Clm++;
        int del_Str = (int) (Math.random() * (Str + 1));
        del_Str++;
        del_Clm--;
        del_Str--;

        System.out.println("Первоначально созданный массив:");
        int Mas[][] = new int[Clm][Str];

        int Mas2[][] = new int[Clm][Str];
        for (int i = 0; i < Clm; i++) {
            for (int q = 0; q < Str; q++) {
                Mas[i][q] = (int) (Math.random() * (80_000 + 1)) - 5_000;
                if (i == del_Clm || q == del_Str) {
                    Mas2[i][q] = 0;
                } else Mas2[i][q] = Mas[i][q];
                System.out.print(Mas[i][q] + " ");            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Сейчас будут удалены " + del_Str + " строка и " + del_Clm + " столбец");

        System.out.println("Массив после операции удаления:");
        for (int i = 0; i < Clm; i++)
            System.out.println(Arrays.toString(Mas2[i]));
        System.out.println("Поздравляю,программа успешно завершена!");

    }}
