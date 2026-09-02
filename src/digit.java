public class digit {
    
    // Count number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    
    // Sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    
    // Reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return reversed;
    }
    
    // Check if number is palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
    
    // Main method
    public static void main(String[] args) {
        int number = 12345;
        
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Reversed number: " + reverseNumber(number));
        System.out.println("Is palindrome: " + isPalindrome(number));
    }
}
