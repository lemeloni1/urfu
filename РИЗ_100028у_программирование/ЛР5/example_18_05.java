import java.util.Scanner;
public class example_18_05
{
    public static void main(String[] args)
    {
        System.out.print("Введите целочисленное значение переменной: ");
        test_01 t = new test_01();
        t = new test_01(inputInteger());
        System.out.println(t.result());
    }

    public static int inputInteger()
    {
        Scanner input_chislo = new Scanner(System.in);
        var value = input_chislo.nextInt();
        return value;
    }
}
class test_01
{
    private int num;

    public test_01() {
        this.num = 0;
    }

    public test_01(int i) {
        if (i <= 100) {
            this.num = i;
        } else {
            this.num = 100;
        }
    }

    int result() {
        return this.num;
    }
}