
        package Sorting;

import java.util.ArrayList;

public class Merge {

    // Merge two sorted halves
    static void Ms(ArrayList<Integer> nums, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        // Compare elements from both halves
        while (left <= mid && right <= high) {

            if (nums.get(left) <= nums.get(right)) {
                temp.add(nums.get(left));
                left++;
            }
            else {
                temp.add(nums.get(right));
                right++;
            }
        }

        // Remaining elements from left half
        while (left <= mid) {
            temp.add(nums.get(left));
            left++;
        }

        // Remaining elements from right half
        while (right <= high) {
            temp.add(nums.get(right));
            right++;
        }

        // Copy temp back into nums
        for (int i = low; i <= high; i++) {
            nums.set(i, temp.get(i - low));
        }
    }

    // Merge Sort
    static void Mergesort(ArrayList<Integer> nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        Mergesort(nums, low, mid);
        Mergesort(nums, mid + 1, high);

        Ms(nums, low, mid, high);
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 5; i >= 0; i--) {
            nums.add(i);
        }

        System.out.println("Before sorting: " + nums);

        Mergesort(nums, 0, nums.size() - 1);

        System.out.println("After sorting: " + nums);
    }
}
