public class leedcode_1 {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target=17;
        int[] ans = twoSum(nums,target);
        if (ans[0] != -1) {
            System.out.println(nums[ans[0]] + "," + nums[ans[1]]);
        } else {
            System.out.println("No pair found");
        }

        
    } 
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{-1, -1};
        }

    
}
