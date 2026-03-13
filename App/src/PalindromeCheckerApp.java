import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// Strategy interface for palindrome checking
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Strategy 1: Use Stack
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Strategy 2: Use Deque (double-ended queue)
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;

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
        return true;
    }
}

// Context class for dynamic strategy selection
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
        return true; // Palindrome
    }
}

    public boolean check(String input) {
        if (strategy == null) {
            throw new IllegalStateException("PalindromeStrategy not set!");
        }
        return strategy.isPalindrome(input);
    }
}

// Main application
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeCheckerContext checker = new PalindromeCheckerContext();

        System.out.println("=== Strategy Pattern Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        System.out.println("Choose algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> checker.setStrategy(new StackStrategy());
            case 2 -> checker.setStrategy(new DequeStrategy());
            default -> {
                System.out.println("Invalid choice. Using StackStrategy by default.");
                checker.setStrategy(new StackStrategy());
            }
        }

        if (checker.check(input)) {
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