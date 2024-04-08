package recursion;

import java.util.Arrays;

public class Sorting1 {
    public static void main(String[] args) {
        
        // BubbleSort
        int [] arr={7,8,1,2,6,3,5};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));


        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){

                if(arr[j] > arr[j+1]){

                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
