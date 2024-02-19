package example_18;

public class example_18_02_1 {
    private String s;

    public example_18_02_1(String s) {
        setS(s);
    }

    public void setS(String s) {
        this.s = s;
    }
    public void setS() {
        this.s = "nothing8";
    }

    public int getSLenght() {
        return s.length();
    }

}
