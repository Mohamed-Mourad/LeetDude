class Solution {
    public boolean isPalindrome(int x) {
        // Check if the input number is negative; negative numbers can't be palindromes
        if (x < 0) {
            return false;
        }
        
        // Store the original value of x in 'original'
        int original = x;
        
        // Initialize a variable 'reversed' to store the reversed number
        int reversed = 0;
        
        // Reverse the number
        while (x != 0) {
            // Extract the last digit of 'x'
            int digit = x % 10;
            
            // Add the extracted digit to the 'reversed' number, shifting its digits left
            reversed = reversed * 10 + digit;
            
            // Remove the last digit from 'x'
            x /= 10;
        }
        
        // Compare the reversed number with the original to determine if it's a palindrome
        return original == reversed;
    }
}
