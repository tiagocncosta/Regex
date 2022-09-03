package regex;
//8 - Write a function to remove all non-alphanumeric characters from a given string

public class Exercício8 {
    public static void main(String[] args) {
        final String regex = "[^A-Za-z0-9 ]";
        String string = "Let's ha=%&$ve s\\~~-!!#ome fun with Mi?ndera Regex exercises! Any" +
                " doubts? Feel free to goooglize.";
        string = string.replaceAll(regex,"");
        System.out.println("New String: " + string);



    }
}
