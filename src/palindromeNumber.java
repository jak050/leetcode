public class palindromeNumber {

    public static boolean isPalindrome(int x) {
        String numbers = String.valueOf(x);
        String reversenumbers = "";
        boolean ispalindrom = false;
        String number = String.valueOf(x);

        for (int i = numbers.length() - 1; i >= 0 ; i--) {
            reversenumbers += String.valueOf(x).charAt(i);
        }

        if (number.equals(reversenumbers) ) {
            ispalindrom = true;
        }
        return ispalindrom;
    }

    static void main() {
        int x = 10;
        isPalindrome(x);
    }
}
