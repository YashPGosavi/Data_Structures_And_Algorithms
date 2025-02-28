class HouseRobber {
    public static int maxStolenValue(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev = 0; // Maximum sum excluding the previous house
        int currMaxSum = nums[0]; // Maximum sum including the first house

        for (int i = 1; i < nums.length; i++) {
            int curr = Math.max(nums[i] + prev, currMaxSum);
            prev = currMaxSum;
            currMaxSum = curr;
        }

        return currMaxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,9,3,3,10,1}; // Maximum stolen value: 16 how? 2+9+10=21

        System.out.println("Maximum stolen value: " + maxStolenValue(nums)); // Output: 21
    }
}