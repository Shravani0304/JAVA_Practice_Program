public class StringPalindrome {
    public static boolean isPAli(String str,int start,int end){
        if(start>=end)return true;
        if(str.charAt(start)!=str.charAt(end))return false;
        return isPAli(str,start+1,end-1);
    }
    public static void main(String[] args) {
        String  str="naman";
        int start=0;
        int end=str.length()-1;
        if(isPAli(str,start,end))
            System.out.println(" palindrome");
        else
            System.out.println("not plaindrome");
    }

}
