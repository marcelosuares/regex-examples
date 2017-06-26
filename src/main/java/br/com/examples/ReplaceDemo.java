package br.com.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * procura no texto o casamento com a regex, se encontra substitui pela
 * expressão desejada
 */
public class ReplaceDemo {

    public static void main(String[] args) {

        String text = "User clientId=23421. Some more text clientId=33432. This clientNum=100";

        //regex a ser procurada        
        Pattern pattern = Pattern.compile("(clientId=)(\\d+)");
        Matcher matcher = pattern.matcher(text);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {

            System.out.println("Masking: " + matcher.group(2));
            matcher.appendReplacement(result, matcher.group(1) + "***masked***");
        }

        matcher.appendTail(result);
        System.out.println(result);
    }

}
