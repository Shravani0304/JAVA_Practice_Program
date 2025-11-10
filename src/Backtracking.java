public class Backtracking {
    public static  void printReverse(int n){
        if(n==10)return;
        printReverse(++n);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printReverse(0);
    }
}
