import java.util.Scanner;
import java.util.Arrays;
public class example_18_07 {
    public static void main(String[] args) {

        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите количество столбцов: ");
        int A = InCMD.nextInt();
        System.out.print("Введите количество строк: ");
        int B = InCMD.nextInt();

        System.out.println("Исходный массив,заполненный случайными числами:");
        int arr [][] = new int[B][A];

        int arr1 [][] = new int[B][A];
        int invert_num = A - 1;
        for (int i = 0; i< B; i++) {
            for (int q = 0; q < A; q++) {
                arr[i][q] = (int) (Math.random()*(20_000+1)) - 8_000;
                if (i %2 == 0) {
                    arr1[i][q] = arr[i][q];
                }else{
                    arr1[i][invert_num] = arr[i][q];
                    invert_num--;
                    if (invert_num < 0){
                        invert_num = A - 1;
                    }}
                System.out.print(arr[i][q] + " ");
            }System.out.println(" ");
        }System.out.println(" ");
        System.out.println("Массив,созданный из элементов предыдущего методом ''змейка'':");
        for (int i = 0; i < B; i++)
            System.out.println(Arrays.toString(arr1[i]));
    }
}
