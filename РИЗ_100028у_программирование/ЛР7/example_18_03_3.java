package example_18;

public class example_18_03_3 extends example_18_03_2{
    public String stringClass3;

    public example_18_03_3(int intClass1, char charClass2, String stringClass3) {
        super(intClass1, charClass2);
        setStringClass3(stringClass3);
    }

    public void setStringClass3(String stringClass3) {
        this.stringClass3 = stringClass3;
    }

    @Override
    public String toString() {
        return "Class3_example17_03{" +
                "stringClass3=" + stringClass3 +
                '}' + "\n" + super.toString();
    }
}
