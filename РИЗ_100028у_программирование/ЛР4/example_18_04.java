import java.util.Scanner;
public class example_18_04 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите величину первой стороны треугольника:");
        int a = id.nextInt();
        System.out.println("Введите величину второй стороны треугольника:");
        int b = id.nextInt();
        for (int i = 0; i<=(a+1); i++) {
            for (int q =1; q <b; q++) {
                if (q == 0 || (i ==b || q<i )){
                    System.out.print("*");
                }else if (i == q) {
                    System.out.print(" ");
                }else 	System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.printf("Построен прямоугольный треугольник со сторонами %d и %d",+a,+b);
    }
}
