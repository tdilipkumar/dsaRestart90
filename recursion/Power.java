package recursion;

public class Power {

    public static int power(int a,int p){
        if(p==0) return 1;
        return a*power(a,p-1);
    }
    public static void main(String[] args) {
        

        int ans = power(2,5);
        System.out.println(ans);
    }
}
