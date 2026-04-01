public class lee268 {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int ans = missing(arr);
        System.out.println(ans);
    }

    public static int missing(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int n = arr.length;
        int expected = n * (n + 1) / 2;
        return expected - sum;
    }
}
