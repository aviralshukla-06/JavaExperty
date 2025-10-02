package strings;

public class CheckConcat {
    public static void main(String[] args) {
        String s = "acskjbvfkj";

        for (int i = 0; i < s.length(); i++) {
            String res = "";
            for (int j = i; j < s.length(); j++) {
                res += s.charAt(j);
                System.out.println(res.startsWith("kj"));
            }
        }
    }
}
