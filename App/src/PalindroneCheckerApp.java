import java.util.Scanner;
public class PalindroneCheckerApp {

    public static void main(String[] args){
        /*
         * ===============================================================
         *   Main class - User Case Palindrome
         *   =============================================================
         *   use case 1 : Application Entry & Welcome Message
         *
         * @param args
         */
        System.out.println("Welcome to Palindrome Checker app Management System ");
        System.out.println("Version 1.0");
        /*
        * =========================================================================
        *    MAIN CLASS - UserCase2PalindromeCheckerApp
        * =========================================================================
        *
        *    USER CASE 2: HardCoded Palindrome Validation
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("input text");
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean isPallindrome = true;
        int length = input.length();
        for(int i=0; i<length/2; i++){
            if (input.charAt(i) != input.charAt(length-i-1)){
                isPallindrome = false; break;

            }
        }
        if (isPallindrome){
            System.out.println("is it a palindrome : true");

        }
        else{
            System.out.println("is it a palindrome : false");
        }

    }
}
