package basic_string;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String s = sc.next();
        replace(s);

    }

    static void replace(String s){
        char target = 'g';
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length();i++){
            if(sb.charAt(i)==target){
                sb.setCharAt(i, 'A');
            }
        }

        String ans= sb+"";
        System.out.println(ans);
    }
}
