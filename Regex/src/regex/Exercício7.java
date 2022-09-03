package regex;

//7 - Write a function to validate a given portuguese mobile phone number

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercício7 {
    public static void main(String[] args) {
        String regex = "(\\+351)?9[1236]\\d{7}";
        String number = "+351914347073 989878789 914347h7u 966633442";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        while (matcher.find()){
            System.out.println("valid numbers:" + matcher.group());
        }

    }
}
