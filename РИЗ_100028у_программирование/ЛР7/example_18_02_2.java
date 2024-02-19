package example_18;

public class example_18_02_2 extends example_18_02_1{
    public example_18_02_2(String s) {
        super(s);
    }

    public int i;

    public example_18_02_2(String s, int i) {
        super(s);
        this.i = i;
    }

    @Override
    public void setS(String s) {
        super.setS(s);
    }

    @Override
    public void setS() {
        super.setS();
    }

    public void setS(int i) {
        super.setS();
        this.i = i;
    }
    public void setS(String s, int i) {
        super.setS(s);
        this.i = i;
    }

}
