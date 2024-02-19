public class example_18_07v2 {
    public static int[] CHAR (char [] ar) {
        int [] int_ar = new int [ar.length];
        for (int i = 0; i < ar.length; i++){
            int_ar [i] = (int) ar [i];
        }
        return int_ar;
    }
}