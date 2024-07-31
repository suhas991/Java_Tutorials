package Assignmnet;

public class SumGreaterThanXOR {
        static final int MOD = 1000000007;

        public static long findExpressionValue(int[] A) {
            int N = A.length;
            long sum = 0;

            // Step 1: Calculate the sum of all elements in the array
            for (int i = 0; i < N; i++) {
                sum = (sum + A[i]) % MOD;
            }

            // Step 2: Calculate the first term: 2 * N * sum
            long firstTerm = (2 * N % MOD) * sum % MOD;

            // Step 3: Calculate the second term
            long secondTerm = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    secondTerm = (secondTerm + (A[i] ^ A[j])) % MOD;
                }
            }

            // Step 4: Calculate the final result
            long result = (firstTerm - secondTerm + MOD) % MOD;

            return result;
        }

        public static void main(String[] args) {
            int[] A = {2, 9, 6};
            System.out.println(findExpressionValue(A)); // Output should be 30
        }
    }
