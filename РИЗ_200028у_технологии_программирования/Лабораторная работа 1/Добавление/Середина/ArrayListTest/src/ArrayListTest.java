import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList ArrayListTest = new ArrayList();
        System.out.println("Время выполнения операции добавления в ArrayList середина коллекции= " + getAddIndexRunningTime(ArrayListTest));
        System.out.println("Время выполнения операции удаления в ArrayList середина коллекции= " + getRemoveIndexRunningTime(ArrayListTest));
        System.out.println("Время выполнения операции поиска в ArrayList середина коллекции= " + getSearchIndexRunningTime(ArrayListTest));
    }
    //добавление элементов
    private static long getAddIndexRunningTime (ArrayList ArrayListTest){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(1000000);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //удаление элементов
    private static long getRemoveIndexRunningTime (ArrayList ArrayListTest){
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(i * Math.random() * 50);
        }
        long start = System.currentTimeMillis();
        ArrayListTest.remove(1000000);
        long end = System.currentTimeMillis();
        return end - start;
    }
    //поиск элемента
    private static long getSearchIndexRunningTime (ArrayList ArrayListTest){
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(1000000);
        }
        ArrayListTest.remove(1000000);
        long start = System.currentTimeMillis();
        System.out.println(ArrayListTest.get(1000000));
        long end = System.currentTimeMillis();
        return end - start;
    }
}
