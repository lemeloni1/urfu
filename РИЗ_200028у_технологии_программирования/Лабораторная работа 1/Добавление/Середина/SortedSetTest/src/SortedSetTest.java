import java.util.*;
public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet <Integer> sortedSet = new TreeSet<Integer>();
        System.out.println("Время выполнения операции добавления в SortedSet середина коллекции = " + getAddIndexRunningTime(sortedSet));
        long start = System.currentTimeMillis();
        System.out.println("Время выполнения операции удаления в SortedSet середина коллекции = " + getRemoveRunningTime(sortedSet));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("Время выполнения операции поиска в SortedSet середина коллекции = " + getAddIndexRunningTime(sortedSet));
    }
    //добавление
    private static long getAddIndexRunningTime (SortedSet SortedSetTest){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++){
            SortedSetTest.add(1000000);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //удаление
    private static long getRemoveRunningTime (SortedSet SortedSetTest){
        int i = 0;
        for (i = 0; i < 2000000; i++){
            SortedSetTest.add(1000000);
        }
        long start = System.currentTimeMillis();
        SortedSetTest.remove(1000000);
        long end = System.currentTimeMillis();

        return end - start;
    }
    //поиск
    private static long getSearchIndexRunningTIme (SortedSet SortedSetTest){
        for (int i = 0; i < 2000000; i++){
            SortedSetTest.add(1000000);
        }
        long start = System.currentTimeMillis();
        SortedSetTest.subSet(999999, 1000001);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
