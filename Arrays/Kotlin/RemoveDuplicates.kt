/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */

// Time complexity: The algorithm runs in O(n) time, where n is the length of the input array. It uses a single loop to iterate through the array once, comparing adjacent elements to identify and overwrite duplicates.

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size == 1) return 1

        var left = 0
        var right = left + 1

        while (right < nums.size) {
            if (nums[left] != nums[right]) {
                left++
                nums[left] = nums[right]
            }
            right++
        }
        return left + 1
    }
}