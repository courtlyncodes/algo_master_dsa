/*189. Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

// Time complexity: O(n), each element is moved exactly once
// Space complexity: O(1), in-place modification without extra data structures
// Used do-while loop to handle cyclic index movement
// Handles multiple disjoint cycles based on GCD of array length and k

class Solution{
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        int start = 0;
        int count = 0;

        while (count < n) {
            int currIndex = start;
            int curr = nums[start];

            do {
                int nextIndex = (currIndex + k % n) % n;
                int temp = nums[nextIndex];

                nums[nextIndex] = curr;
                curr = temp;
                currIndex = nextIndex;
                count++;
            } while (start != currIndex);
            start++;
        }
    }
}