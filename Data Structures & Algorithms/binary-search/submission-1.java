public class Solution {
    public int binary_search(int l, int r, int[] nums, int target) {
        //two pointer question
        
        if (l > r) return -1; //if left pointer crosses right pointer
        //we know there are no more values left so return -1
        int m = l + (r - l) / 2; //finding mid-pointer
        // r - l is half of the distance between right and left pointer.

        if (nums[m] == target) return m; //if mid-point == target return target
        return (nums[m] < target) ? //if target is greater than min-point
            binary_search(m + 1, r, nums, target) : // update left point to equal m + 1 and search right of mid pointer
            binary_search(l, m - 1, nums, target); //update right pointer to search left of mid pointer
    }

    public int search(int[] nums, int target) {
        return binary_search(0, nums.length - 1, nums, target);
    }
}

//Time Complexity: O(log n)
