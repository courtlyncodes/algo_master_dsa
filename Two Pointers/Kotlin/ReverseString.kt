// 344. Reverse String
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Example 2:
// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

// Time complexity: O(n). looping through the characters in a while loop n/2 times 
// Space complexity: O(1) . no extra space used

class Solution {
    fun reverseString(s: CharArray): Unit {
        // s = ["h","e","l","l","o"] -> o,l,l,e,h
        // "p" -> ["p"]

        // init two var pointers
        // var left = 0
        // var right = s.size - 1

        // while (left < right) 
            // var temp = s[left]
            // s[left] = s[right]
            // s[right] = temp
            // left++
            // right--
    // }

        var left = 0
        var right = s.size - 1

        while (left < right) {
            var temp = s[left]

            s[left] = s[right]
            s[right] = temp
            left++
            right--
        }   
    }
}