package example_18;

public class example_18_04_2 extends example_18_04_1{
    public String stringClass2;

    public example_18_04_2(char charClass1) {
        super(charClass1);
    }
    public example_18_04_2(example_18_04_2 p) {
        super(p.charClass1);
        this.stringClass2 = p.stringClass2;
    }

    public example_18_04_2(char charClass1, String stringClass2) {
        super(charClass1);
        this.stringClass2 = stringClass2;
    }
}
