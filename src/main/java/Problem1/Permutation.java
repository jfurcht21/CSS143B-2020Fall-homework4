package Problem1;

import Problem2.ListNode;

import java.util.ArrayList;
import java.util.List;
//Reference: https://www.programcreek.com/2013/02/leetcode-permutations-java/
public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            result.add(new ArrayList<>());
        }
        permute(nums,0,result);
        return result;
    }

    private static void permute(int [] nums, int position, List<List<Integer>> result){
        List<Integer> resultTwo = new ArrayList<>();
        if(position == nums.length-1) {
            List<Integer> oneResult = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                oneResult.add(nums[i]);
            }
            result.add(oneResult);
            return;
        }
        for(int i=position; i<nums.length; i++){
            swap(nums, i, position);
            permute(nums, position+1, result);
            swap(nums, i, position);
        }

    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
