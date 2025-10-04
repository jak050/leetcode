import java.util.Arrays;

public class twoSums {
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1 ; j < nums.length ; j++) {

                    if (nums[i] + nums[j] == target ){
                       return new int[] {i,j};

                    }
                }
            }
            return new int[] {-1,-1};
        }

    static void main() {
        int nums[] = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}