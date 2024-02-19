import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList ArrayListTest = new ArrayList();
        System.out.println("Время выполнения операции добавления в ArrayList начало коллекции= " + getAddIndexRunningTime(ArrayListTest));
        System.out.println("Время выполнения операции удаления в ArrayList начало коллекции= " + getRemoveIndexRunningTime(ArrayListTest));
        System.out.println("Время выполнения операции поиска в ArrayList начало коллекции= " + getSearchIndexRunningTime(ArrayListTest));

    }
    //добавление элементов
    private static long getAddIndexRunningTime (ArrayList ArrayListTest){
        long start = System.currentTimeMillis();
                    ArrayListTest.add(1);
        long end = System.currentTimeMillis();
        return end - start;
    }
    //удаление элементов
    private static long getRemoveIndexRunningTime (ArrayList ArrayListTest){
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(i * Math.random() * 50);
        }
        long start = System.currentTimeMillis();
        ArrayListTest.remove(1);
        long end = System.currentTimeMillis();
        return end - start;
    }
    //поиск элемента
    private static long getSearchIndexRunningTime (ArrayList ArrayListTest){
        for (int i = 0; i < 2000000; i++){
            ArrayListTest.add(i + Math.random() * 50);
        }
        ArrayListTest.remove(1);
        long start = System.currentTimeMillis();
        System.out.println(ArrayListTest.get(1999999));
        long end = System.currentTimeMillis();
        return end - start;
    }
}
