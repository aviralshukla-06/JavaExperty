package Alpha;

public class Pallindrome {

    public static void main(String[] args) {
        String str = "HIBRORBIH";
        int n = str.length() - 1;
        boolean isPal = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                isPal = false;
                break;
            }

        }

        if (isPal) {
            System.out.println("Yes");
        } else {
            System.out.println("Not a pallindrome");
        }
    }
}