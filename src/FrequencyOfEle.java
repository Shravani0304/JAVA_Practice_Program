public class FrequencyOfEle {
    public static void findFreq(int [] arr,boolean [] hash){
        for(int i=0;i<arr.length;i++){
            if(hash[i])continue;
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && !hash[j]){
                    cnt++;
                    hash[j]=true;
                }
            }
            System.out.println(arr[i]+ " : "+cnt);
        }
    }

    public static void main(String[] args) {
        int [] arr={1,5,3,1,5,2,1};
        boolean[] hash=new boolean[arr.length];
        findFreq(arr,hash);

    }
}
