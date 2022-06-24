class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        while (true) {
            int index = i;
            int indexJ = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 500;
                    indexJ = j;
                } else {
                    index = j;
                    break;
                }
            }
            i = index;
            if (i >= nums.length - 1 || indexJ >= nums.length - 1)
                break;
        }


        for (i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i]= nums[j];
                    nums[j]=temp;
                }
            }
        }

        int count = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 500) {
                break;
            }
            count++;
        }

        return count;
    }
}