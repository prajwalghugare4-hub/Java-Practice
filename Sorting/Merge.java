//package Sorting;
//
//import java.util.ArrayList;
//
//public class Merge {
//    static void Ms(ArrayList<Integer>nums,int low,int mid,int high) {
//        int left = low;
//        int right = high;
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        while (left <= mid && right <= high) {
//            if (nums.get(left) < nums.get(right)) {
//                temp.add(nums.get(left));
//                left++;
//            }
//            else {
//                temp.add(nums.get(right));
//                right++;
//            }
//        }
//        while(left<=mid){
//            temp.get(nums.get(left));
//            left++;
//        }
//        while(right<=high){
//            temp.get(nums.get(right));
//            right++;
//        }
//
//        for(int i=low;i<=high;i++){
//            nums.get(i)=temp.get(i);
//        }
//
//    }
//
//    static void Mergesort(ArrayList<Integer>nums, int low, int high){
//        if(low>high) return ;
//        int mid =(low+high)/2;
//        Mergesort(nums,low,mid);
//        Mergesort(nums,mid+1,high);
//        Ms(nums,low,mid,high);
//    }
//
//    public static void main(String[] args) {
//            ArrayList nums=new ArrayList<>();
//            for(int i= 5;i>=0;i--){
//                nums.add(i);
//            }
//            int n=nums.size();
//
//            for(int i= 0;i<5;i++){
//                System.out.print(nums);
//            }
//
//
//            Mergesort(nums,0,n-1);
//            System.out.println();
//            for(int i= 0;i<5;i++){
//                System.out.print(nums);
//            }
//    }
//}
