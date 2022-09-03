package regex;

//3 - Write a function to find the sequences of one upper case letter followed by lower case letters

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercício3 {
    public static void main(String[] args) {
        final String regex ="[A-Z][a-z]*";
        final String string = "Akasdakjl askAms zZzzz lolala";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            System.out.println("Solutions :" + matcher.group());
        }
    }

}
