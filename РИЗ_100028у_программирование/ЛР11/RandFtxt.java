/*Код программы RandFtxt - запись строк и чтение их из файла с произвольным доступом.*/
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
//Выполнить запись строк и чтение их из файла с произвольным доступом.
public class RandFtxt{
    public static void main(String[] args) {
        try {
            File folder = new File("E:\\My");
            if (!folder.exists())
                folder.mkdir();
            File f1 = new File("E:\\My\\strokiRand.txt");
            f1.createNewFile();
            //При вводе строк символ абзаца (нажатие Enter) имеет такой же размер в байтах, как и другие символы, и учитывается при вычислении размера файла
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("Сколько строк надо записать в файл? \n =>");
            int count = sc.nextInt();
            sc.nextLine(); // очистка буфера после ввода числа
            RandomAccessFile rf = new RandomAccessFile(f1, "rw"); // чтение/запись
            rf.setLength(0);
            long len = rf.length();
            System.out.println("Открыт файл размером " + len + " байт");
            System.out.println("Введите строки:");
            int kol = 0; // счетчик букв
// Записать строки в файл
            for (int i = 0; i < count; i++) {
                String s = sc.nextLine();
                rf.writeUTF(s);
                kol += s.length();
            }
            len = rf.length();
            System.out.println("Размер файла в байтах = " + len);
            rf.close();
// Открыть файл для чтения "r"
            rf = new RandomAccessFile(f1, "r");
// Вывод строк из файла на экран
            System.out.println("Строки из файла:");
            rf.seek(0); // перевести указатель в начало файла (на первое слово)
            for (int i = 0; i < count; i++)
                System.out.println("Строка " + i + " начинается с байта "
                        + rf.getFilePointer() + " - " + rf.readUTF() + " - заканчивается байтом " + (rf.getFilePointer() - 1));
            rf.close();
        } catch (IOException e) {
            System.out.println("End of file " + e);
        }
    }   }
