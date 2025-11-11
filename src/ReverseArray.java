import java.util.Arrays;

public class ReverseArray {
//    public static  void reverseArray(int [] arr,int start,int end){
//        if(start>=end)return;
//        int temp=arr[start];
//        arr[start]=arr[end];
//        arr[end]=temp;
//        reverseArray(arr,++start,--end);
//    }

    public static  void reverseArray2(int [] arr,int i,int n){
        if(i==n/2)return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        reverseArray2(arr,i+1,n);
    }


    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int n=arr.length;

        System.out.println("before reverse:"+Arrays.toString(arr));
        reverseArray2(arr,0,n);
       // using two pointer approach: reverseArray(arr,0,arr.length-1);
        System.out.println("after reversing: "+Arrays.toString(arr));

    }
}
