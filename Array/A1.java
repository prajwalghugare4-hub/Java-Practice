package Array;

import java.util.ArrayList;
import java.util.HashMap;



public class A1 {
    static int Missing(ArrayList<Integer>nums){
        int n=nums.size();
        int total=sum(nums);
        int S=(n*n+1)/2;
        int ans=total-S;
        return ans;
    }
    public static int sum(ArrayList<Integer> nums){
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<Integer>();
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        int a =Missing(nums);
        System.out.println(a);

    }
}
