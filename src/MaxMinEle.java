import java.util.Arrays;

public class MaxMinEle {
    public static void main(String[] args) {
        int [] arr={22, 14, 8, 17, 35, 3};
        int [] result=maxMin(arr);
        System.out.println(Arrays.toString(result));

    }
    public static  int[] maxMin(int [] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
             if (arr[i]<min) {
                min=arr[i];
                
            }
        }
        return new int[]{max, min};
    }
    
}
