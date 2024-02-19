package example_18;

public class example_18_01_2 extends example_18_01_1 {

   // public example_18_01_2(String s) {
   //     super(s);
   // }

    private String s;

    public example_18_01_2(String s1, String s2) {
        super(s1);
        this.s = s2;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + getClass().getSimpleName() + " string field = " + this.s;
    }
}
