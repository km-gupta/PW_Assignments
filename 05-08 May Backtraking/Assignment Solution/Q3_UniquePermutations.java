import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Q3_UniquePermutations {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Q3_UniquePermutations uniquePermutations = new Q3_UniquePermutations();
        List<List<Integer>> result = uniquePermutations.permuteUnique(nums);
        System.out.println(result);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> path, List<List<Integer>> result) {
        if (nums.length == 0) {
            result.add(new ArrayList<>(path));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }
                int[] remaining = removeElement(nums, i);
                path.add(nums[i]);
                backtrack(remaining, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private int[] removeElement(int[] nums, int index) {
        int[] remaining = new int[nums.length - 1];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == index) {
                continue;
            }
            remaining[j++] = nums[i];
        }
        return remaining;
    }
}
