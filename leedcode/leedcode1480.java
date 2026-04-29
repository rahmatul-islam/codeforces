import java.util.Arrays;

class Solution {
    public static  int[] runningSum(int[] nums) {
        int[] count=new int[nums.length];
        count[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            count[i]=count[i-1]+nums[i];
             
        
        }
        return count;
        
    }
}

public class leedcode1480{
    public static void main(String [] args){
        int[] nums={1,2,3,4};
        int []result=Solution.runningSum(nums);
        System.out.println(Arrays.toString(result));

    }

}