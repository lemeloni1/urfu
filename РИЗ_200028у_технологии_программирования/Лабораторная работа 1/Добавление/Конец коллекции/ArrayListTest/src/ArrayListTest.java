import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList ArrayListTest = new ArrayList();
        System.out.println("Время выполнения операции добавления в ArrayList конец коллекции = " + getAddIndexRunningTime(ArrayListTest));
        System.out.println("Время выполнения операции удаления в ArrayList конец коллекции = " + getRemoveIndexRunningTime(ArrayListTest));
        System.out.println("Время выполнения операции поиска в ArrayList конец коллекции= " + getSearchIndexRunningTime(ArrayListTest));
    }
    //добавление элементов
    private static long getAddIndexRunningTime (ArrayList ArrayListTest){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(1999999);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //удаление элементов
    private static long getRemoveIndexRunningTime (ArrayList ArrayListTest){
        for (int i = 0; i < 1_000_000; i++){
            ArrayListTest.add(1999999);
        }
        long start = System.currentTimeMillis();
        ArrayListTest.remove(1999999);
        long end = System.currentTimeMillis();
        return end - start;
    }
    //поиск элемента
    private static long getSearchIndexRunningTime (ArrayList ArrayListTest){
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(i + Math.random() * 50);
        }
        ArrayListTest.remove(1999999);
        long start = System.currentTimeMillis();
        System.out.println(ArrayListTest.get(1999999));
        long end = System.currentTimeMillis();
        return end - start;
    }
}
