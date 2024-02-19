import java.util.Scanner;
public class example_18_04
{
    public static void main(String[] args)
    {
        CharAndInteger cai = new CharAndInteger( inputChar(), (int) inputDouble() );
        cai = new CharAndInteger(inputDouble());
        System.out.println(cai.result());
    }
    public static double inputDouble ()
    {
        Scanner input_value = new Scanner(System.in);
        var value = input_value.nextDouble();
        return value;
    }
    public static char inputChar()
    {
        Scanner input_value = new Scanner(System.in);
        var value = input_value.next();
        return value.charAt(0);
    }
}
class CharAndInteger
{
    char first;
    int second;
    CharAndInteger(char a, int b) {
        this.first = a;
        this.second = b;
    }
    CharAndInteger(double s) {
        this.first = (char)((int)s);
        double res = (s - (double)((int)s)) * 100.0D;
        this.second = (int)res;
    }
    String result() {
        char var10000 = this.first;
        return var10000 + Integer.toString(this.second);
    }}
