/*Создать приложение с использованием рекурсии для перевода целого числа,
введенного с клавиатуры, в двоичную систему счисления.*/
package example_18_82;
import java.util.Scanner;

public class example_18_82_Main {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите десятичное число ");
        int num = inCMD.nextInt();
        example_18_82_Rec REC = new example_18_82_Rec();
        REC.setNum(num);
        REC.getNum();
    }
}
