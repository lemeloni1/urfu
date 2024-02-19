/*Прочитать и вывести на экран информацию из трех источников:
файла на диске, интернет-страницы и массива типа byte.*/
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
public class KlassFile2 {
    public static void main(String[] args) {
        try {
            System.out.println(ReadBytesFromStream(new FileInputStream("C:\\Test\\MyFile2.txt"))
                    + "\n\n\n");
            System.out.println(ReadBytesFromStream(new URL("http://google.com").openStream())
                    + "\n\n\n");
            System.out.println(ReadBytesFromStream(new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4}))
                    + "\n\n\n");
        } catch (Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }
    }
    public static String ReadBytesFromStream(InputStream inS) throws IOException
    {
        String res = "";
        while(true)
        {
            int oneByte = inS.read();
            if(oneByte != -1)
            {
                res += (char)oneByte;
            }
            else
            {
                res += "\n end";
                break;
            }
        }
        return res;
    }
}
