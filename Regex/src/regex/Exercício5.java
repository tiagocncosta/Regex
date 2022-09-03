package regex;

//5 - Write a function to match a string that contains only upper and lowercase letters, numbers, and underscores

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercício5 {
    public static void main(String[] args) {
        String regex = "\\w*[_][^/s]";
        String string = "tEste_ Te [-] {.~t[este t{teste t-teste _asdA?1_";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            System.out.println("Solutions: " + matcher.group());
        }
   }
}
