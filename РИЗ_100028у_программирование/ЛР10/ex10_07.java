/*Чтение из одного файла и запись в другой файл данных построчно с использованием буфера в 1 килобайт.*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
public class KlassFile7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=null;
        BufferedWriter out =null;
        try {
            in = new BufferedReader(new FileReader(GetFileByName("MyFile611.txt")), 1024);
            out= new BufferedWriter(new FileWriter(GetFileByName("MyFile612.txt")));
            int lineCount = 0;
            String res;
            while ((res = in.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + res);
                out.write(res);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.flush();
            out.close();
        }
    }
    private static String DirPath = "D:\\Test\\%s";
    public static File GetFileByName(String filename) throws IOException {
        File f1=new File(String.format(DirPath, filename));
        f1.createNewFile();
        return f1;
    }
}