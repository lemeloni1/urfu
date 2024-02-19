import java.util.*;
class Test
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();
        // Добавляем элементы в HashSet с помощью метода add()
        h.add("Индия");
        h.add("Австралия");
        h.add("Южная Африка");
        h.add("Индия");// пытаемся добавить еще один такой же элемент
        // Выводим элементы HashSet в консоль
        System.out.println(h);
        System.out.println("Список содержит Индия или нет:" +
                h.contains("Индия"));
        // Удаляем элементы из множества с помощью метода remove()
        h.remove("Австралия");
        System.out.println("Список после удаления Австралия:"+h);
        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Повторение списка:");
        for (String s : h) System.out.println(s);
    }
}
