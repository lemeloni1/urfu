/*Создать первый файл на диске и записать в него заданное 
количество вещественных чисел. Далее создать второй файл и переписать в него 
все числа из первого файла. */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class KlassFile4 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(GetFileByName("numIsh.txt"));
            FillFile(fos);
            fos.close();
            fis = new FileInputStream(GetFileByName("numIsh.txt"));
            fos = new FileOutputStream(GetFileByName("numRez.txt"));
            CopyFile(fis, fos);
            fos.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }
        finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e2) {
                    /*NOP*/
                }
            }
            if (fis != null) {
                try {
                    fos.close();
                } catch (Exception e2) {
                    /*NOP*/
                }
            }
        }
    }

    public static File GetFileByName(String filename) throws IOException {
        String dirPath = "C:\\Test\\%s";
        File f1=new File(String.format(dirPath, filename));
        f1.createNewFile();
        return f1;
    }
    public static void FillFile(FileOutputStream fs) throws IOException
    {
        System.out.println("Введите числа\n");
        BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos = new DataOutputStream(fs);
        try {
            String newLine = ds.readLine();
            while (!newLine.isEmpty()) {
                int newInt = Integer.parseInt(newLine);
                dos.writeInt(newInt);
                newLine = ds.readLine();
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }
        finally {
            dos.close();
            ds.close();
        }
    }
    public static void CopyFile(FileInputStream fis, FileOutputStream fos) throws IOException
    {
        DataInputStream dis = new DataInputStream(fis);
        DataOutputStream dos = new DataOutputStream(fos);
        while(true)
        {
            try {
                int newInt = dis.readInt();
                dos.writeInt(newInt);
                System.out.println(String.format("%d\n", newInt));
            } catch (IOException e) {
                break;
            } catch (Exception e) {
                System.out.println("Произошла ошибка " + e.getMessage());
            }
        }
    }
}