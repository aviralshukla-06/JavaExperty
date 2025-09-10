package Alpha;

public class Unknown {

    public static void main(String[] args) {
        int[] a = { 2, 4, 6 };
        int k = 2;
        System.out.println(es(a, k));
        int[] b = { 1 };
        int key = 1;
        System.out.println(ess(b, key));
    }

    public static int es(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                i++;
                return a[i];
            }
        }
        return 1;
    }

    public static int ess(int[] b, int key) { 
        for (int i = 0; i < b.length; i++) { 
            if (b[i] == key) { 
                return b[i]; 
            } 
        } 
        return 0; 
    }
}