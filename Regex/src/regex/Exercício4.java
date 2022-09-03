package regex;

//4 - Write a function that matches a string that has a 'p' followed by anything, ending in 'q'

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercício4 {
    public static void main(String[] args) {


        String regex = "p[\\w\\W]*q";
        String string = "pKAJSks!?*njknkasq sadkljas&$#ldpq pq Pq asPpquuw";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            System.out.println("Solution: " + matcher.group());
        }
    }
}