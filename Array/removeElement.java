class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize a variable 'k' to keep track of the index of the next valid element
        int k = 0;

        // Iterate through the array 'nums'
        for (int i = 0; i < nums.length; i++) {

            // Check if the current element is not equal to the value to be removed
            if (nums[i] != val) {

                // Copy the current element to the position at index 'k'
                nums[k] = nums[i];

                // Increment the index 'k'
                k++;
            }
        }

        // Return the number of remaining elements (the value of 'k')
        return k;
    }

    public static void main(String[] args) {
        // Declare and initialize an integer array 'nums'
        int[] nums = {3, 2, 2, 3};

        // Declare and initialize an integer 'val' representing the value to be removed
        int val = 3;

        // Create an instance of the 'Solution' class
        Solution solution = new Solution();

        // Call the 'removeElement' method to remove all occurrences of 'val' from 'nums'
        int result = solution.removeElement(nums, val);

        // Print the number of remaining elements after removing 'val'
        System.out.println("The number of elements not equal to " + val + ": " + result);
    }
}
