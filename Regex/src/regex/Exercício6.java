package regex;

//6 - Write a function to remove all the vowels of a given string. Return the new string

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercício6 {
    public static void main(String[] args) {
            final String regex = "[aeiou]";
            String string = "Let's have some fun with Mindera Regex exercises! Any" +
            " doubts? Feel free to goooglize.";
            string = string.replaceAll(regex,"");
        System.out.println("New String: " + string);


    }
}
