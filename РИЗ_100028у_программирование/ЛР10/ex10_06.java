/*Чтение из одного файла и запись в другой файл данных посимвольно. */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class KlassFile6 {
    public static void main(String[] args) throws IOException {
        FileReader in=null; // можно сразу записать
        FileWriter out =null; // можно сразу записать
        try {
            in = new FileReader(GetFileByName("MyFile61.txt")); // файл дл¤ чтени¤
            out= new FileWriter(GetFileByName("MyFile62.txt"), true); // файл дл¤ записи
            // данные считываютс¤ и записываютс¤ побайтно, как и для InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                // out.write((char)oneByte); // запись с уничтожением ранее существующих данных
                out.append((char)oneByte); // запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        }
    }
    private static String DirPath = "C:\\Test\\%s";
    public static File GetFileByName(String filename) throws IOException {
        File f1=new File(String.format(DirPath, filename));
        f1.createNewFile();
        return f1;
    }
}