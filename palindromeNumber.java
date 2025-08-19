// 9. Palindrome Number
// Easy
// 10.5K
// 3.1K
// Companies
// Given an integer x, return true if x is a palindrome, and false otherwise.
// A number is a palindrome when it reads the same backward as forward.
// For example, 121 is a palindrome while 123 is not.

// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Example 2:
// Input: x = -121
// Output: false

// Example 3:
// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


// Constraints:
// -231 <= x <= 231 - 1

// Follow up: Could you solve it without converting the integer to a string?


class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + (x % 10);
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}