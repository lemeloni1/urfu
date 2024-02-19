import java.util.*;
public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet <Integer> sortedSet = new TreeSet<Integer>();
        System.out.println("Время выполнения операции добавления в SortedSet конец коллекции= " + getAddIndexRunningTime(sortedSet));
        long start = System.currentTimeMillis();
        System.out.println("Время выполнения операции удаления в SortedSet конец коллекции= " + getRemoveRunningTime(sortedSet));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("Время выполнения операции поиска в SortedSet конец коллекции= " + getAddIndexRunningTime(sortedSet));
    }
    //добавление
    private static long getAddIndexRunningTime (SortedSet SortedSetTest){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++){
            SortedSetTest.add(1999999);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //удаление
    private static long getRemoveRunningTime (SortedSet SortedSetTest){
        int i = 0;
        for (i = 0; i < 2000000; i++){
            SortedSetTest.add(1999999);
        }
        long start = System.currentTimeMillis();
        SortedSetTest.remove(1999999);
        long end = System.currentTimeMillis();

        return end - start;
    }
    //поиск
    private static long getSearchIndexRunningTIme (SortedSet SortedSetTest){
        for (int i = 0; i < 2000000; i++){
            SortedSetTest.add(1999999);
        }
        long start = System.currentTimeMillis();
        SortedSetTest.subSet(1999999, 1999998);
        long end = System.currentTimeMillis();
        return end - start;

    }
  }
