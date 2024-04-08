package recursion;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        

        int [] arr={1,2,3,7,4,9,6,5};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){


            for(int j=i+1;j<arr.length;j++){


                if(arr[i] > arr[j]){

                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
