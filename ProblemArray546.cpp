class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::vector<int> result;

        for (int i = 0 ; i < nums.size(); i++) {
            int flag = 0;
        int indexJ = i;
        for (int j = i + 1 ; j < nums.size() ; j++) {
            if (nums[i] + nums[j] == target) {
                flag = 1;
                indexJ = j;
                break;
            }
        }

        if (flag == 1) {
            result.push_back(i);
            result.push_back(indexJ);
            break;
        }

        }

        return result;
    }
};