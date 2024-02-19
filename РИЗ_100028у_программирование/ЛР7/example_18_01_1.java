package example_18;

public class example_18_01_1 {
    private String s;

    public example_18_01_1(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + " string field = " + this.s);
    }

}
