import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check if a string is a palindrome (case-insensitive & space ignored)
    public static boolean isPalindrome(String input) {
        // Normalize the string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers for start and end
        int left = 0;
        int right = normalized.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (case-insensitive & space ignored).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}