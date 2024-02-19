public class example_18_01 {
    public static void main(String[] args) {
        int high = 11;
        int shir = 23;
        for (int i = 0; i<=high; i++) {
            for (int q = 0; q <= shir; q++) {
                if (q == 0 || i == 0 || i == high|| q == shir){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Построен прямоугольник");

    }
}
