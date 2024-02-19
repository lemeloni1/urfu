package example_18;

public class example_18_05_1 {
    private String stringClass1;

    public example_18_05_1(String stringClass1) {
        this.stringClass1 = stringClass1;
    }

    public void showVar() {
        System.out.println(getClass().getSimpleName() +
                " stringClass1 = " +
                stringClass1);
    }
}
