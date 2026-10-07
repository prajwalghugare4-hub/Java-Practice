package Array;

import static java.lang.Integer.max;

public class A2 {
    static int MaxiOnes(int []nums){
        int maxi=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                maxi=max(cnt,maxi);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int []nums=new int[10];
        nums= new int[]{0, 1, 1, 1,0,1,0,1,0,1};
        System.out.print(MaxiOnes(nums));
    }
}
