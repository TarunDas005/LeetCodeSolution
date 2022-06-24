class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = -1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + 1;
            if (temp > 9) {
                lastIndex = i;
                digits[i] = 0;
            } else {
                digits[i] = temp;
                break;
            }
        }

        if (lastIndex == 0) {
            int[] tempData = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 1; i--) {
                tempData[i + 1] = digits[i - 1];
            }
            tempData[0] = 1;
            return tempData;
        } else {
            return digits;
        }
    }
}