package basic_string;

import java.util.Scanner;

public class CapitalizeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String s = sc.nextLine();
        camel(s);    
    }
     
    static  void capitalize(String s){
        StringBuilder sb = new StringBuilder(s);
        int j=0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==' '){
                j=0;
            }else{

                String firstChar = sb.substring(i, i+1);
                // System.out.println("this is "+i+"th"+ firstChar);
                firstChar = firstChar.toUpperCase();
                char letter = firstChar.charAt(0);
                if(j==0){
                    sb.setCharAt(i,letter);
                }

                if(i==sb.length()-1 || sb.charAt(i+1) == ' '){
                    sb.setCharAt(i, letter);
                }
                j++;
            }

            
        }
        System.out.println(sb.toString());
    }

    static  void kebabCase(String s){
        StringBuilder sb = new StringBuilder(s);
    
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==' '){
                sb.setCharAt(i, '_');
            }
            
        }
        System.out.println(sb.toString());
    }

    static  void camel(String s){
        StringBuilder sb = new StringBuilder(s);
        int j=0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==' '){
                j=0;
            }else{

                String firstChar = sb.substring(i, i+1);
                // System.out.println("this is "+i+"th"+ firstChar);
                firstChar = firstChar.toUpperCase();
                char letter = firstChar.charAt(0);
                if(j==0){
                    sb.setCharAt(i,letter);
                }
                j++;
            }

            
        }

        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==' '){
                sb.delete(i, i+1);
            }
        }
        System.out.println(sb.toString());
    }

}
