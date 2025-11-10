public class ArmstrongNo {
    public static void main(String[] args) {
        int cnt=0;
        int sum=0;
        int num=372;

        for(int i=num;i>0;i/=10){
            cnt++;

        }

        for(int i=num;i>0;i/=10){
            int rem=i%10;
            int len=1;
            for(int j=1;j<=cnt;j++){
                len=len*rem;
            }
            sum+=len;

        }
        if(sum==num){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
