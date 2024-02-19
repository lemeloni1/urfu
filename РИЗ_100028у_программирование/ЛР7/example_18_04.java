package example_18;

public class example_18_04 {
    public static void main(String[] args) throws CloneNotSupportedException {
        example_18_04_3 test = new example_18_04_3('b',"check", 123 );
        example_18_04_3 testClone = new example_18_04_3(test);
        System.out.println(testClone.intClass3 + " " +
                testClone.charClass1 + " " +
                testClone.stringClass2);
    }

}
