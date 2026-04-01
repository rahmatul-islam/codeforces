public class lee167 {
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target=17;
        int[] ans =twoSum(numbers, target);
        int len = ans.length();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(ans[i]);
        }
            
        
        
    }
    public static  int[] twoSum(int[] numbers, int target) {

        for (int i = 1; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
