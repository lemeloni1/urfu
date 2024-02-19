import java.util.Scanner;
public class example_18_02 {
    public static void main(String[] args)
    {
        System.out.println("Введите название дня недели:");
        Scanner in = new Scanner(System.in);
        String Day = in.nextLine();
        switch(Day)
        {
            case "понедельник": System.out.println("1 день недели");
                break;
            case "вторник": System.out.println("2 день недели");
                break;
            case "среда": System.out.println("3 день недели");
                break;
            case "четверг": System.out.println("4 день недели");
                break;
            case "пятница": System.out.println("5 день недели");
                break;
            case "суббота": System.out.println("6 день недели");
                break;
            case "воскресенье": System.out.println("7 день недели");
                break;
            default: System.out.println("Ошибка. Дня недели под таким номером не существует!");
                break;
        }

    }

}
