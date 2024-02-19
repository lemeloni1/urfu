public class example_18_09v2 {
    public char[] MST ( char[] a ){
        char [] ar = new char [a.length];
        for (int i = 0; i < a.length; i++){
            int buf = a.length - i - 1;
            ar[buf] = a[i];
        }
        return ar;
    }
}
