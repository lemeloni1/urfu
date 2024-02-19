import java.util.Scanner;
public class example_18_06 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите количество элементов для массива = ");
        int num = InCMD.nextInt();

        int [] x = new int [num];
        System.out.print("Созданный массив = ");

        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(50_999+1)) - 5_000;
            x[i] = a;
            System.out.print(a + " ");
        }
        Scanner InCMD_ = new Scanner(System.in);
        System.out.print("\nВыберите количество элементов = ");
        int num_ = InCMD_.nextInt();
        System.out.print("Оставшийся массив = ");
        example_18_06v2 arg_ = new example_18_06v2();
        int [] print_arr = arg_.Limit(x, num_);
        System.out.print("\nВернувшийся массив = ");
        for (int i = 0; i < print_arr.length; i++){
            System.out.print(print_arr[i] + " ");
        }
    }
}

