public class Backtracking {
//    public static  void printReverse(int n){
//        if(n==10)return;
//        printReverse(++n);
//        System.out.println(n);
//    }

    public static  void printLinear(int n){
        if(n==1)return;
        printLinear(--n);
        System.out.println(n);

    }

    public static void main(String[] args) {
      //  printReverse(0);
        printLinear(11);
    }
}
