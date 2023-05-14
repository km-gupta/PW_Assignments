import java.util.Arrays;

public class Q1_EqualSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2};
        int k = 2;
        boolean result = canPartitionKSubsets(arr, k);
        System.out.println(result);
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        int target = sum / k;
        Arrays.sort(nums);
        int i = nums.length - 1;
        if (nums[i] > target) {
            return false;
        }
        while (i >= 0 && nums[i] == target) {
            i--;
            k--;
        }
        return search(new int[k], nums, i, target);
    }

    public static boolean search(int[] groups, int[] nums, int index, int target) {
        if (index < 0) {
            return true;
        }
        int num = nums[index];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + num <= target) {
                groups[i] += num;
                if (search(groups, nums, index - 1, target)) {
                    return true;
                }
                groups[i] -= num;
            }
            if (groups[i] == 0) {
                break;
            }
        }
        return false;
    }
}
