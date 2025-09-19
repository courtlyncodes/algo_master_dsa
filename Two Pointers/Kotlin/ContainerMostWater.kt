// // 11. Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
// Input: height = [1,1]
// Output: 1

// Time complexity = O(n) -- loop touches each element at most once
// Space complexity = O(1) -- no extra space beside variables, no extra data structures

class Solution {
    fun maxArea(height: IntArray): Int {
        // [1,4,2,6,7,2,1] 
        // [1,2,3,8,6,2,5,4,8,3,7]
        // elements have to be equal or > than one another 
        // AND their position difference * the lowest of the two pointers (sliding window) has to be the greatest
        // mutliply diff between pointer positions and lowest value
        var maxArea = 0

        var left = 0
        var right = height.size - 1

        while (left < right) {
           var min = minOf(height[left], height[right])
           var diff = right - left
           var area = min * diff
           maxArea = maxOf(maxArea, area)
            
            if (height[left] < height[right]) left++ else right--
        }
        return maxArea
    }
}