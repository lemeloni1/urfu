import java.util.Arrays;
import java.util.Scanner;
public class example_18_10 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int num = InCMD.nextInt();
        int [] x = new int [num];
        System.out.println("Исходный массив");
        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(150_000+1)) - 5_000;
            x[i] = a;
            System.out.print(x[i] + " "); }
        example_18_10v2 AAA = new example_18_10v2();
        int [] print_ar = AAA.TF(x);
        System.out.print("\nМаксимальный элемент массива = " + print_ar[1] + "\nМинимальный элемент массива = " + print_ar[0] );
    }
}
