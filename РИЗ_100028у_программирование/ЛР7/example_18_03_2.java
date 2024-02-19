package example_18;

public class example_18_03_2 extends example_18_03_1{
    public char charClass2;

    public example_18_03_2(int intClass1,char charClass2) {
        super(intClass1);
        this.charClass2 = charClass2;
    }

    public void setCharClass2(char charClass2, int intClass1) {
        this.charClass2 = charClass2;
        setIntClass1(intClass1);
    }

    @Override
    public String toString() {
        return "Class2_example17_03{charClass2=" +
                charClass2 +
                "}\n" +
                super.toString();
    }
}
