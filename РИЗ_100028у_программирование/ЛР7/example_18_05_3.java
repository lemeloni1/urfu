package example_18;

public class example_18_05_3 extends example_18_05_1{
    private char charClass3;

    public example_18_05_3(String stringClass1, char charClass3) {
        super(stringClass1);
        this.charClass3 = charClass3;
    }

    @Override
    public void showVar() {
        super.showVar();
        System.out.println(getClass().getSimpleName() +
                " charClass3 = " +
                charClass3);
    }
}
