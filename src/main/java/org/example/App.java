package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) { }

    public static boolean isPalindrome(String phrase)
    {
        if (phrase == null || phrase.isBlank()) {
            return false;
        }
        if (phrase.length() == 1 && !Character.isAlphabetic(phrase.charAt(0))) {
            return false;
        }
        var i = 0;
        var j = phrase.length() - 1;
        while (i < j)
        {
            while (!Character.isAlphabetic(phrase.charAt(i))) i++;
            while (!Character.isAlphabetic(phrase.charAt(j))) j--;
            if (Character.toLowerCase(phrase.charAt(i++)) != Character.toLowerCase(phrase.charAt(j--)))
                return false;
        }
        return true;
    }
}
