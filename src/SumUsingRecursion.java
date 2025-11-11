public class SumUsingRecursion{

    public static void sumOfInteger(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return ;
        }

        sumOfInteger(i-1,sum+i);

    }

    public static void main(String[] args) {
        sumOfInteger(10,0);

    }
}
