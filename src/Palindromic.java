
public class Palindromic {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String test1 = "madam";
        String test2 = "racecar";
        String test3 = "rotor";
        String test4 = "hello";

        System.out.println("'" + test1 + "' является палиндромом: " + isPalindrome(test1)); // true
        System.out.println("'" + test2 + "' является палиндромом: " + isPalindrome(test2)); // true
        System.out.println("'" + test3 + "' является палиндромом: " + isPalindrome(test3)); // true
        System.out.println("'" + test4 + "' является палиндромом: " + isPalindrome(test4)); // false
    }
}



