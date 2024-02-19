package example_18;

public class example_18_05_2 extends example_18_05_1{
    private int intClass2;

    public example_18_05_2(String stringClass1, int intClass2) {
        super(stringClass1);
        this.intClass2 = intClass2;
    }

    @Override
    public void showVar() {
        super.showVar();
        System.out.println(getClass().getSimpleName() +
                " intClass2 = " +
                intClass2);
    }
}
