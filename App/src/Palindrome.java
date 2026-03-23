import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ==========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ==========================================================
 * * Use Case 7: Deque Based Optimized Palindrome Checker
*/
public class Palindrome {

    /*
     * Application entry point for UC7.

     */
    public static void main(String[] args) {

        String input = "refer";


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }


        boolean isPalindrome = true;


        while (deque.size() > 1) {
            Character first = deque.removeFirst();
            Character last = deque.removeLast();

            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}