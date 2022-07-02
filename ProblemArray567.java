class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length) {
                    if (nums[j] == 0)
                        j++;
                    else
                        break;
                }
                for (int k = i; k <= j && j < nums.length; k++) {
                    if (k == i)
                        nums[k] = nums[j];
                    else nums[k] = 0;
                }
                i++;
            } else {
                i++;
            }
        }
    }
}