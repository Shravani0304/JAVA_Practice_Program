

public class ReverseString {
       public static void main(String[] args) {
         String str="shravani";
         String st=new StringBuilder(str).reverse().toString();
           System.out.println(st);
//       char[] st=str.toCharArray();
//        int start=0;
//        int end=str.length()-1;
//        reverse(st,start,end);
//        System.out.println("String is: "+ Arrays.toString(st));
   }
//    public  static void reverse(char [] st,int start,int end){
//        if(start>=end)return;
//        char temp=st[start];
//        st[start]=st[end];
//        st[end]=temp;
//
//        reverse(st,start+1,end-1);
//
//    }

}
