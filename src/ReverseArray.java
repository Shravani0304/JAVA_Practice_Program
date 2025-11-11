import java.util.Arrays;

public class ReverseArray {
    public static  void reverseArray(int [] arr,int start,int end){
        if(start>=end)return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr,++start,--end);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println("before:"+Arrays.toString(arr));
        reverseArray(arr,0,arr.length-1);
        System.out.println("after: "+Arrays.toString(arr));

    }
}
