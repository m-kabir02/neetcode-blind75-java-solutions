public class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {    //iterates n times
            set.add(num);         //O(1) insertion 
        }
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {  //O(1) search using contains 
                return i;
            }
        }
        return -1;
    }
}
// O(n) + O(n) = O(2n) = O(n)

/*
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
(Arrays.sort(nums) typically uses quicksort to sort the array
quicksort recap: divides the array in half continuously then sorts  O (log n)
to sort, you must look at each number in the array (n)
total O(nlog n) )
        for (int i = 0; i < n; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}

O(n log n) -> Arrays.sort(n) 

*/

 