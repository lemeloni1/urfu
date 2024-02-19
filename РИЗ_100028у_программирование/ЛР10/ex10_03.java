/*Прочитать и вывести на экран информацию из предварительно 
созданного файла с использованием буфера в 5 байт. */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
public class KlassFile3 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            String filePath = "D:\\Test\\MyFile2.txt";
            fileInputStream = new FileInputStream(filePath);
            System.out.println(ReadBytesFromStream(fileInputStream) + "\n\n\n");

        } catch (Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }
        finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                    /*NOP*/
                }
            }
        }
    }
    public static String ReadBytesFromStream(InputStream inS) throws IOException
    {
        int BUFF_SIZE = 5;
        byte[] buff = new byte[BUFF_SIZE];
        var res = "";
        while(true)
        {
            int byteCount = inS.read(buff);
            if(byteCount != -1) {
                var outputFormat = "К1оличество = %d\nbuff = %s\nstr=%s\n";
                res = res + String.format(outputFormat, byteCount, Arrays.toString(buff), new String(buff, 0, byteCount, "cp1251"));
            }
            else {
                break;
            }
        }
        return res;
    }
}
