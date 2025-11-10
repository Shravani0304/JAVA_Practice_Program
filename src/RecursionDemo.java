public class RecursionDemo {

//    public static void recursion(int cnt){
//        if(cnt==5)return;
//        System.out.println(cnt);
//        recursion(++cnt);
//    }

//    public static  void myName(int cnt){
//        if (cnt==5)
//            return;
//        System.out.println("shravani");
//        myName(++cnt);
//    }
    public static  void linearPrint(int num,int n){
        if(n==num)
            return;
        System.out.println(n);
        linearPrint(num,++n);
    }


    public static void main(String[] args) {
        //recursion(  1);
        //myName(1);
        linearPrint(11,1);
    }
}
