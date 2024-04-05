 package Strings;

import java.util.Arrays;

class Basics {

    public static void addChar(String s,char p){
        s+=p;
    }

    public static void main(String[] args) {
        
        System.out.println("Dilip"+5);
        System.out.println("Dilip"+5+9);
        System.out.println(5+9+"dilip");

        //declaration
        String str;
        str = "dilip";
        System.out.println(str);
        str="vinay";
        System.out.println(str+99);

        String s= "dilip";
        char s1='@';
        System.err.println((int)s1);
        char ch = 65;
        System.out.println(ch);


        String d= "dili";
        addChar(d,'p');
        System.out.println(d);
        addChar(d,'K');
        System.out.println(d);
        // d.charAt(0)='p';
        //String is immutable 
        d+="pkumar";
        System.out.println(d);


        char [] arr = d.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("".valueOf(arr));
    }
}