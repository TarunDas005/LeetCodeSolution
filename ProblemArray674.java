class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int numOneLength = nums1.length;
        int numTwoLength = nums2.length;
        if (numOneLength == 0 || numTwoLength == 0)
            return new int[]{};
        else {
            List<Integer> result = new ArrayList<>();
            if (numOneLength < numTwoLength) {
                for (int i = 0; i < numOneLength; i++) {
                    int num = nums1[i];
                    int index = -1;
                    for (int j = 0; j < nums2.length; j++) {
                        if (num == nums2[j]) {
                            index = j;
                            break;
                        }
                    }

                    if (index != -1) {
                        result.add(num);
                        int[] copyArray = new int[nums2.length - 1];
                        System.arraycopy(nums2, 0, copyArray, 0, index);
                        System.arraycopy(nums2, 0, copyArray, 0, index);
                        System.arraycopy(nums2, index + 1, copyArray, index, nums2.length - index - 1);
                        nums2 = copyArray;
                    }
                }
                return result.stream().mapToInt(i -> i).toArray();
            } else {
                for (int i = 0; i < numTwoLength; i++) {
                    int num = nums2[i];
                    int index = -1;
                    for (int j = 0; j < nums1.length; j++) {
                        if (num == nums1[j]) {
                            index = j;
                            break;
                        }
                    }


                    if (index != -1) {
                        result.add(num);
                        int[] copyArray = new int[nums1.length - 1];
                        System.arraycopy(nums1, 0, copyArray, 0, index);
                        System.arraycopy(nums1, 0, copyArray, 0, index);
                        System.arraycopy(nums1, index + 1, copyArray, index, nums1.length - index - 1);
                        nums1 = copyArray;
                    }
                }
                return result.stream().mapToInt(i -> i).toArray();
            }
        }
    }
}