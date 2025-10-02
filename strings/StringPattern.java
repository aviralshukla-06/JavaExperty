package strings;

public class StringPattern {

    public static void main(String[] args) {
        String str = "gggggbbbbbtttttyyyyyiiiii";
        // char ch = str.charAt(0);
        int count = 1;
        String ans = "";

        for(int curr = 1; curr<str.length(); curr++){
            if(str.charAt(curr)==str.charAt(curr-1)){
                count += 1;
                
            }else{
                ans += str.charAt(curr-1);
                ans += count;

                // ch = str.charAt(curr);
                count = 1;
            }
            
           
            // ans += rem;
        }
        // System.out.println(count);
        ans += str.charAt(str.length()-1);
        ans += count;
        // System.out.println(rem);
        System.out.println(ans);
        
    }
}