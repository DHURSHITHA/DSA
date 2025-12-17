class Solution {

    // This method returns all unique triplets whose sum is zero
    public List<List<Integer>> threeSum(int[] nums) {

        // List to store the final result (list of triplets)
        List<List<Integer>> res = new ArrayList<>();

        // Sort the array to use two-pointer technique and handle duplicates
        Arrays.sort(nums);

        // Loop to fix the first element of the triplet
        // We stop at length-2 because we need 3 numbers
        for (int i = 0; i < nums.length - 2; i++) {

            // If the current element is same as the previous one,
            // skip it to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) 
                continue;

            // Initialize two pointers
            // left pointer starts just after i
            int left = i + 1;

            // right pointer starts at the end of the array
            int right = nums.length - 1;

            // Use two-pointer approach to find pairs
            while (left < right) {

                // Calculate sum of current triplet
                int sum = nums[i] + nums[left] + nums[right];

                // Case 1: Found a valid triplet
                if (sum == 0) {

                    // Add the triplet to the result list
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for left pointer
                    // This avoids adding same triplet again
                    while (left < right && nums[left] == nums[left + 1]) 
                        left++;

                    // Skip duplicate values for right pointer
                    while (left < right && nums[right] == nums[right - 1]) 
                        right--;

                    // Move both pointers after storing valid triplet
                    left++;
                    right--;
                }

                // Case 2: Sum is less than 0
                // We need a bigger number, so move left pointer right
                else if (sum < 0) {
                    left++;
                }

                // Case 3: Sum is greater than 0
                // We need a smaller number, so move right pointer left
                else {
                    right--;
                }
            }
        }

        // Return all unique triplets
        return res;
    }
}
