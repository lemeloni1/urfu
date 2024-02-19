import java.util.Scanner;
class example_18_06
{    public static void main(String[] args)
{
    Test t1 = new Test(inputInteger(), inputInteger());
    t1 = new Test(inputInteger());
    System.out.println(t1.result());
}
    public static int inputInteger()
    {
        Scanner input_value = new Scanner(System.in);
        var value = input_value.nextInt();
        return value;
    }
}
class Test
{
    private int min = 0;
    private int max = 0;
    public Test(int i, int k) {
        int min, max;
        min = (i < k)? i: k;
        max = (i < k)? k: i;
        this.max = (max > this.max)? max : min;
        this.min = (min < this.min)? min : max;
    }
    public Test(int i) {
        min = (i < min)? i: 0;
        max = (i > max)? i: 0;
    }
    String result() {
        String var10000 = Integer.toString(this.min);
        return var10000 + " / " + Integer.toString(this.max);
    }
}
