package example_18;

public class example_18_04_3 extends example_18_04_2{
    public int intClass3;


    public example_18_04_3(char charClass1, String stringClass2) {
        super(charClass1, stringClass2);
    }

    public example_18_04_3(char charClass1, String stringClass2, int intClass3) {
        super(charClass1, stringClass2);
        this.intClass3 = intClass3;
    }

    public example_18_04_3(example_18_04_3 p){
        super(p.charClass1, p.stringClass2);
        this.intClass3 = p.intClass3;
    }
}
