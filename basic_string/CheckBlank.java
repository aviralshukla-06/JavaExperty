package basic_string;
public class CheckBlank {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string: ");

        // String s = sc.next();
        String s;
        s = "                ";

        checkBlankStr(s);
        checkEmptyStr(s);
    }

    static void checkBlankStr(String str){
        boolean isBlank = true;
        String s = str;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                isBlank = false;
                break;
            }
        }
        if(isBlank){
            
            System.out.println("Blank string");
        }else{
            
            System.out.println("Not blank");
        }
        
    }

    static void checkEmptyStr(String str){
        boolean isEmpty = true;
        String s = str;
        for(int i=0; i<s.length(); i++){
            if(s.length()!=0){
                isEmpty = false;
                break;
            }
        }
        if(isEmpty){
            
            System.out.println("Empty string");
        }else{
            
            System.out.println("Not Empty");
        }
        
    }
}
