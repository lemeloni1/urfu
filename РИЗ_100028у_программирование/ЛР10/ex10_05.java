/*Создать файл на диске, ввести заданное с клавиатуры 
количество строк текста и записать их в файл в формате UTF-8.*/
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class KlassFile5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите имя файла => "); String
                fname=sc.nextLine();
        try{
            // создаетс¤ файл
            File f1 = GetFileByName(fname);
            System.out.println("Полный путь файла: "+ f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int n=sc.nextInt();
            // создается поток для записи с учетом типа данных в DataOutputStream, и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut=
                    new DataOutputStream( new FileOutputStream(f1));
            sc.nextLine(); //очистка буфера
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s=sc.nextLine();
                dOut.writeUTF(s );
                //или dOut.writeUTF(s +"\n" ); запись отдельных строк
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); // закрываем поток,чтение и вывод данных из созданного файла
            DataInputStream dIn=new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        }catch (Exception e) {
            System.out.println(""+e);
        }}
    private static String DirPath = "D:\\Test\\%s";
    public static File GetFileByName(String filename) throws IOException {
        File f1=new File(String.format(DirPath, filename));
        f1.createNewFile();
        return f1;
    }}