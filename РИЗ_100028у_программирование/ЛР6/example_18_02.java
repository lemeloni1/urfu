import java.util.Scanner;
public class example_18_02
{
    public static void main(String[] args)
    {
        var i = 0;
        var res = valueWhile();
        while (i <= res)
        {
            Test2.addValue();
            i++;
        }
    }
    public static int valueWhile ()
    {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Введите значение с помощью которого вы увидете результат работы класс: ");
        var num = input_value.nextInt();
        return num;
    }
}
class Test2
{
    private static int num = 0;

    static void addValue ()
    {
        System.out.println("Значение статического поля: " + num);
        num++;
    }
}
