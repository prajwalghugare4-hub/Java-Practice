package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class A3 {

    static ArrayList<Integer> Ans(ArrayList<Integer> nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Find elements appearing once or twice
        for (int num : map.keySet()) {
            if (map.get(num) == 1 || map.get(num) == 2) {
                ans.add(num);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(3);

        System.out.println(Ans(nums));
    }
}
