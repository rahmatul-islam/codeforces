public class leedcode1672 {
    public static void main(String[] args) {

        int accounts[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int result = Solution.maximumWealth(accounts);
        System.out.println(result);

    }
}

class Solution {
    public static int maximumWealth(int[][] accounts) {
        int[] sum = new int[101];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        return max;
    }
}
