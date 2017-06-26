package br.com.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * procura no texto o casamento com a regex, se enconta coloca na lista
 */
public class MatcherDemo {

    public static void main(String[] args) {

        String text = "object space 340480K, 94% used [0x00000000c0000000,0x00000000d3a876e8,0x00000000d4c80000)";

        //regex a ser procurada
        Pattern pattern = Pattern.compile("(object space) (\\d+K,) (\\d+%)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            //indicar qual o grupo deseja obter o valor
            System.out.println(matcher.group(3));
        }
    }

}
