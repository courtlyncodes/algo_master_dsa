/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

// Time Complexity: O(n) – We iterate through the array once to build a frequency map (O(n)),
// then again through the map's entries (O(n) in worst case), so total time is linear.
class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
      

        for (int n = 0; n < nums.length; n++) {
            map.put(nums[n], map.getOrDefault(nums[n], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > majority) {
                return key;
            }
        }
        return -1;
    }
}