public class example_18_07 {
    public static void main(String[] args) {
        String abc[] = new String [10];
        abc[0] = "a";
        abc[1] = "c";
        abc[2] = "e";
        abc[3] = "g";
        abc[4] = "i";
        abc[5] = "k";
        abc[6] = "m";
        abc[7] = "o";
        abc[8] = "q";
        abc[9] = "s";
        System.out.println("Прямой порядок элементов алфавита");
        for (int i = 0; i <= 9; i++)
        {
            System.out.print(abc[i] + " ");
        }
        System.out.println("\nОбратный порядок элементов алфавита");
        for (int i = 9; i >= 0; i--){
            System.out.print(abc[i] + " ");
        }
    }
}
