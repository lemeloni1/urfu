import java.util.HashSet;
public class HashSetTest {
    public static void main(String[] args) {
        HashSet HashSetTest = new HashSet();
        System.out.println("Время выполнения операции добавления в HashSet конец коллекции = " + getAddIndexRunningTime(HashSetTest));
        System.out.println("Время выполнения операции удаления в HashSet конец коллекции= " + getRemoveIndexRunningTime(HashSetTest));
        System.out.println("Время выполнения операции поиска в HashSet конец коллекции= " + getSearchIndexRunningTime(HashSetTest));
    }
    //добавление элементов
    private static long getAddIndexRunningTime (HashSet time){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++){
            time.add(1999999);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //удаление элементов
    private static long getRemoveIndexRunningTime (HashSet HashSetTest){
        for (int i = 0; i < 2000000; i++){
            HashSetTest.add(i * Math.random() * 50);
        }
        long start = System.currentTimeMillis();
        HashSetTest.remove(1999999);
        long end = System.currentTimeMillis();
        return end - start;
    }
    //поиск элемента
    private static long getSearchIndexRunningTime (HashSet HashSetTest){
        for (int i = 0; i < 2000000; i++){
            HashSetTest.add(i + Math.random() * 50);
        }
        HashSetTest.remove(1999999);
        long start = System.currentTimeMillis();
        System.out.println(HashSetTest.contains(1));
        long end = System.currentTimeMillis();
        return end - start;
    }
}
