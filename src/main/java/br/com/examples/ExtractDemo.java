package br.com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * procura no texto o casamento com a regex, se enconta coloca na lista
 */
public class ExtractDemo {

    public static void main(String[] args) {

        String text = "The son of Homer Simpson is Bart";

        //regex a ser procurada
        Pattern pattern = Pattern.compile("(Homer|Bart|Meg|Lisa|Marge)");
        Matcher matcher = pattern.matcher(text);

        List<String> resultList = new ArrayList<>();

        while (matcher.find()) {

            resultList.add(matcher.group());
        }

        System.out.println("result: " + resultList.toString());
    }
}
