
import java.util.Arrays;

public class lee169{
    public static void main(String[] args) {
        

    }
    public int majorityElement(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        int num=nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == num) {
                count++;
            } else {
                count = 1;
                num = nums[i];
            }
            if (count > n / 2) {
                return num;
            }
        }
        return num;
    }
}

