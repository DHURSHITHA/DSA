class Solution {

    int[] memo;  // memo[target] = min squares needed for target

    public int func(int target) {
        // Base cases
        if (target == 0) return 0;
        if (target < 0) return Integer.MAX_VALUE;

        // Memo check
        if (memo[target] != -1) return memo[target];

        int min = Integer.MAX_VALUE;

        // Try all perfect squares
        for (int i = 1; i * i <= target; i++) {
            int res = func(target - i * i);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + res);
            }
        }

        // Store result
        memo[target] = min;
        return min;
    }

    public int numSquares(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return func(n);
    }
}
