/*
238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

// Time Complexity: O(n)
// The algorithm performs two linear passes over the input array—once to calculate prefix (left) products and once to incorporate suffix (right) products. Each element is processed twice, resulting in linear time.

// Space Complexity: O(n)
// An additional array of size n is used to store the final output. No other auxiliary data structures are used, making the space usage linear.

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        var right = 1

        // nums = [1,2,3,4]
        // lefts
        for (n in nums.indices) {
            if (n == 0) {
                answer[0]= 1
            } else {
                answer[n] = answer[n - 1] * nums[n - 1]
            }
        }
    
    // multiply rights
        for (n in nums.size - 1 downTo 0) {
        answer[n] = answer[n] * right
            right *= nums[n]
        }
        return answer
    }
}