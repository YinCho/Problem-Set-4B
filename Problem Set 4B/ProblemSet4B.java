import java.util.Scanner;
/**
 * 
 *
 * Jerry You
 * 
 */
public class ProblemSet4B {

    public static String PalindromeChecker(String str) {
        String cleanedStr = "";
        String nonLetters = ",.:;()[]{}!?@#$%^&* ";
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            if (!nonLetters.contains(s) && s != " ") {
                cleanedStr += str.substring(i, i + 1);
            }
        }
        cleanedStr = cleanedStr.toLowerCase();
        for (int i = 0; i < cleanedStr.length(); i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(cleanedStr.length() - i - 1)) {
                return "This String is not a Palindrome";
            }
        }
        return "This String is a Palindrome";
    }

    public static String pigLatinTranslator(String str) {
        String result = "";
        String temp = "";
        int backLetter;
        str = " " +str +" ";
        for(int i = 0; i<str.length();i++) {
            if(str.charAt(i) == ' ') {
                backLetter = str.lastIndexOf(" ", i-1);

                if (i == str.indexOf(" "))
                    temp = "";
                else 
                    temp = str.substring(backLetter + 1, i);

                if(temp.length() > 2)
                    result += temp.substring(1, temp.length()) + temp.charAt(0) + "ay ";
                else result += temp +" ";

            }
        }
        return result;

    }

    public static int strictlyAscendingNumbers (int low, int high) {
        int count = 0;
        while (low <= high) {
            int num = low;
            int lastDigit = num % 10;
            num = num / 10;
            boolean isAscending = true;
            while (num > 0) {
                int currentDigit = num % 10;
                if (currentDigit >= lastDigit) {
                    isAscending = false;
                    break;
                }
                lastDigit = currentDigit;
                num = num / 10;
            }
            if (isAscending) {
                count++;
            }
            low++;
        }
        return count;
    }

    public void timesTable(int n) {
    int mostDigits = (n * n + "").length();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            int product = i * j;
            String productStr = product + " ";

            int leadingSpaces = mostDigits - productStr.length();

            for (int k = 0; k < leadingSpaces; k++) {
                System.out.print(" ");
            }

            System.out.print(productStr);
        }
        System.out.println();
    }
}


}
