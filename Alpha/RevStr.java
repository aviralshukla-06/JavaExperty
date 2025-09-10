package Alpha;

public class RevStr {

    public static void main(String[] args) {
        String str = "Hello";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr = str.charAt(i) + newStr;
        }

        System.out.println(newStr);
    }
}