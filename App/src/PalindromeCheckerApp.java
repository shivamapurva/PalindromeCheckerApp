import java.util.Scanner;
import java.util.Stack;

// UC11: Object-Oriented Palindrome Service
class PalindromeChecker {
    // Internal stack used for palindrome checking
    private Stack<Character> stack;

    // Constructor initializes the stack
    public PalindromeChecker() {
        stack = new Stack<>();
    }

    // Method to check palindrome
    public boolean checkPalindrome(String input) {
        // Normalize string: remove spaces, punctuation, and make lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        stack.clear(); // Clear stack before use

        // Push all characters into the stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}