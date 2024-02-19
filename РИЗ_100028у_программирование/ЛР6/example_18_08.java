import java.util.Scanner;
public class example_18_08 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите количество элементов для массива = ");
        int num = InCMD.nextInt();

        int [] x = new int [num];
        System.out.print("Созданный массив = ");

        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(150_000+1)) - 15_000;
            x[i] = a;
            System.out.print(a + " ");
        }
        example_18_08v2 arg_ = new example_18_08v2();
        double print_ = arg_.SR_ZNC(x);
        System.out.print("\n Среднее значение элемента для массива = " + print_);
    }
}
