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
    fun majorityElement(nums: IntArray): Int {
        val count = (nums.size/2)
        var map = mutableMapOf<Int, Int>()

        for (n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
        }

        for ((k, v) in map) {
            if (v > count) {
                return k
            }
        }
        return -1
    }
}