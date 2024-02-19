import java.util.Scanner;
public class example_18_03 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите величину первой стороны прямоугольника:");
        int a = id.nextInt();
        System.out.println("Введите величину второй стороны прямоугольника:");
        int b = id.nextInt();
        for (int i = 0; i<=a; i++) {
            for (int q = 0; q <= b; q++) {
                if (q == 0 || i == 0 || i == a|| q == b){
                    System.out.print("2");
                }else System.out.print("2");
            }
            System.out.println(" ");

        }
        System.out.printf("Построен прямоугольник с заданными сторонами %d * %d", +a, +b);
    }
}
