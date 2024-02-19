package example_18;

public class example_18_05 {
    public static void main(String[] args) {
        example_18_05_1 testClass1 = new example_18_05_1("testClass1");
        testClass1.showVar();

        example_18_05_2 testClass2 = new example_18_05_2("testClass2", 2);
        testClass2.showVar();

        example_18_05_3 testClass3 = new example_18_05_3("testClass3", 'b');
        testClass3.showVar();

        System.out.println("вызов метода через объектную переменную суперкласса на объект подкласса \"testClass2\"");
        example_18_05_1 objA;
        objA = testClass2;
        objA.showVar();
    }
}
