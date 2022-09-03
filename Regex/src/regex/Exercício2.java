package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2 - Write a function to find sequences of lowercase letters joined with a underscore

public class Exercício2 {
    public static void main(String[] args) {


        final String regex = "[a-z]+_[a-z]+";
        final String string = "asdkjnas_sada iwasdkasnd asds__asdija _as_as";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            System.out.println("Found this : " + matcher.group());
        }
    }
}
