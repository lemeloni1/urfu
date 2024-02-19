import java.util.Scanner;
public class example_18_05 {
    public static void main(String[] args) {

        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите количество столбцов: ");
        int A = InCMD.nextInt();
        System.out.print("Введите количество строк: ");
        int B = InCMD.nextInt();

        System.out.println("Первоначальный массив:");
        int mas [][] = new int[B][A];
        for (int i = 0; i<B; i++) {
            for (int q = 0; q < A; q++) {
                mas[i][q] = (int) (Math.random()*(50_000+1));
                System.out.print(mas[i][q] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Массив,где строки поменялись со столбцами:");

        int mas1 [][] = new int [B][A];
        for (int i = 0; i<A; i++) {
            for (int q = 0; q < B; q++) {
                mas1[q][i] = mas[q][i];
                System.out.print(mas1[q][i] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Ура!");
    }
}
