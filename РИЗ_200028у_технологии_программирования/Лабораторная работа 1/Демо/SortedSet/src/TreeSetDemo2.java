import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Москва");
        treeSet.add("Екатеринбург");
        treeSet.add("Нижний Тагил");
        treeSet.add("Пермь");
        treeSet.add("Москва");

        System.out.println(treeSet);

        SortedSet<String> subSet = treeSet.subSet("Екатеринбург", "Нижний Тагил");
        System.out.println("SubSet: " + subSet);

        System.out.println("HeadSet: " + treeSet.headSet("Нижний Тагил"));
        System.out.println("TailSet: " + treeSet.tailSet("Нижний Тагил"));
        System.out.println("Первый элемент: " + treeSet.first());
        System.out.println("Последний элемент: " + treeSet.last());
    }
}