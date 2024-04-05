package Strings;

import java.util.Scanner;

public class Toggle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            int y=ch;
            if(y>=65 && y<=90){
                ans+=(char)(y+32);
            }
            else{
                ans+=(char)(y-32);
            }
        }
        System.out.println(ans);
    }
    
}
