class Solution {
    public void rotate(int[] nums, int k) {
        int m = 0;
        if (k < nums.length) {
            int[] tempNumbers = new int[k];
            for (int i = nums.length - k; i < nums.length; i++) {
                tempNumbers[m++] = nums[i];
            }

            System.arraycopy(nums, 0, nums, k, nums.length - k);

            System.arraycopy(tempNumbers, 0, nums, 0, k);

        } else if (k > nums.length) {
            int mod = k % nums.length;
            if (mod != 0) {
                int[] tempNumbers = new int[mod];
                for (int i = nums.length - mod; i < nums.length; i++) {
                    tempNumbers[m++] = nums[i];
                }

                System.arraycopy(nums, 0, nums, mod, nums.length - mod);

                System.arraycopy(tempNumbers, 0, nums, 0, mod);
            }
        }

    }
}