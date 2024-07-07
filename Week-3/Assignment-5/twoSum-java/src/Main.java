import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 1, 2, 3};
        int target = 6;

        try {
            int[] result = Solution.twoSum(nums, target);
            System.out.println("index: " + Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
