package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Selection {


    static void sort(ArrayList<Integer> nums){
        int n=nums.size();
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if (nums.get(j) < nums.get(mini))mini=j;
            }
            Collections.swap(nums,mini,i);
        }
    }

    public static void main(String[] args) {
        ArrayList nums=new ArrayList<Integer>(5);
        for(int i= 5;i>=0;i--){
            nums.add(i);
        }

        for(int i= 0;i<5;i++){
         System.out.print(nums);
        }
      sort(nums);
       System.out.println();
        for(int i= 0;i<5;i++){
            System.out.print(nums);
        }
    }
}
