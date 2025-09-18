package Alpha;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class RevStr {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // char data[] = { 'a', 'b', 'c' };

        // String str = new String(data);
        // byte[] bytes = str.getBytes("ASCII");

        // System.out.println(Arrays.toString(bytes));

        String str = "hi😍💓🤣";
        System.out.println(str.codePointAt(4));

        // String str = "Hello";
        // String newStr = "";
        // for (int i = 0; i < str.length(); i++) {
        // newStr = str.charAt(i) + newStr;
        // }

        // System.out.println(newStr);
    }
}