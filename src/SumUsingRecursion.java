public class SumUsingRecursion{

//    public static void sumOfInteger(int i,int sum){
//        if(i<1){
//            System.out.println(sum);
//            return ;
//        }
//
//        sumOfInteger(i-1,sum+i);
//
//    }

    public  static  int printSum(int n){
        if(n==0)
            return 0;
        return n+printSum(n-1);
    }

    public static void main(String[] args) {
 //       sumOfInteger(10,0);
        int n=10;
        System.out.println( printSum(n));

    }
}
