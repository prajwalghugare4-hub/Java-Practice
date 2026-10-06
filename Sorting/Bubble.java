package Sorting;

import java.util.ArrayList;
import java.util.Collections;


public class Bubble {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static void Bubblesort(ArrayList<Integer>nums){
        int n=nums.size();
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(nums.get(j)>=nums.get(j+1)){
                    Collections.swap(nums,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList nums=new ArrayList<Integer>();
        for(int i= 5;i>=0;i--){
            nums.add(i);
        }

        for(int i= 0;i<5;i++){
            System.out.print(nums);
        }
        Bubblesort(nums);
        System.out.println();
        for(int i= 0;i<5;i++){
            System.out.print(nums);
        }
    }
}
