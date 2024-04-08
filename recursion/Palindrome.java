package recursion;

public class Palindrome {

    public static boolean check(int st,int e,String s){
        if(st>=e) return true;

        boolean temp = s.charAt(st)==s.charAt(e);
        if(!temp){
            return false;
        }

        return temp&&check(st+1,e-1,s);

    }
    public static void main(String[] args) {
        

        String s = "malayalami";
        if(check(0,s.length()-1,s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
