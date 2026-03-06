public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "racecar";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Convert string to char array
        char[] charArray = str.toCharArray();

        // Step 2: Initialize two pointers
        int left = 0;
        int right = charArray.length - 1;

        // Step 3: Compare characters moving toward the center
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false; // Mismatch found, not a palindrome
            }
            left++;  // Move forward
            right--; // Move backward
        }

        return true; // All characters matched
    } // This was the brace causing the issue (ensure only one exists here)
}