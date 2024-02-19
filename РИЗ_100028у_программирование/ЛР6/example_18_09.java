import java.util.Scanner;
public class example_18_09 {
    public static void main(String[] args) {
        System.out.print("Введите строку = ");
        Scanner InCMD = new Scanner(System.in);
        String str = InCMD.nextLine();
        char [] str_char = str.toCharArray();
        System.out.print("Массив на выходе = ");
        example_18_09v2 arg_ = new example_18_09v2();
        char [] print_arr = arg_.MST(str_char);
        for (int i = 0; i < print_arr.length; i++) {
            System.out.print(print_arr[i] + " ");
        }
    }}
