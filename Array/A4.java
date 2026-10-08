package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A4 {
    public static List<List<Integer>>Threesum(ArrayList<Integer> nums){
        int n=nums.size();
      ;
        List<List<Integer>>ans=null;
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            if(i>=0 && nums.get(i)==nums.get(i+1))continue;
            int j=i+1;
            int k=n-1;
            while(j<k) {
                int sum = nums.get(i) + nums.get(j) + nums.get(k);
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    int a=nums.get(i),b=nums.get(j),c=nums.get(k);
                    List<Integer,Integer,Integer>temp=null;
                    temp.add(a,b,c);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums.get(j)==nums.get(j-1))j++;
                    while(j<k && nums.get(k)==nums.get(k+1))k--;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<Integer>();
        nums.add(-1);
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(-1);
        nums.add(-4);

        List<List<Integer>>ans=Threesum(nums);
        System.out.println(ans);
    }
}
