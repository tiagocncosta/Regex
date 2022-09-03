package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1 - Write a function that matches a string that has a p followed by zero or more q's
public class Exercicio1 {
    public static void main(String[] args){
        final String regex = "[pP][qQ]*";
        final String string = "Let's have pqsome fun wipqqqth MipQndera RepPQgex exercises! Any" +
        " doubts? Feel free to goooglize.";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group());
        }

    }

}
