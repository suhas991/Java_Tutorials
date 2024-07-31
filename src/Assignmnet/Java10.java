package Assignmnet;

import java.util.List;

public class Java10 {
    public static int diffFunc(int N, List<Integer> Arr) {
        int MOD = 1000000007;
        int ans = 0;

        for (int i = 1; i < N; i++) {
            int prev = Arr.get(i - 1);
            int curr = Arr.get(i);

            // Compute the maximum difference considering Arr[i] as minimum
            int diff1 = Math.abs(curr - prev);

            // Compute the maximum difference considering Arr[i] as maximum
            int diff2 = Math.abs(curr - prev);

            // Update the answer
            ans = (ans + Math.max(diff1, diff2)) % MOD;
        }

        return ans;
    }


    public static void main(String[] args) {
        // Example usage:
        List<Integer> Arr = List.of(2,-5,-8);
        int N = Arr.size();
        System.out.println(diffFunc(N, Arr)); // Output depends on the array provided
    }
}
