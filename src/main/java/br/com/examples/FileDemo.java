package br.com.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * procura no arquivo o casamento com a regex, se enconta coloca na lista
 */
public class FileDemo {

    public static void main(String[] args) {

        try {

            //entrar com o local do arquivo
            File file = new File("/tmp/test.log");
            InputStream inputStream = new FileInputStream(file);
            BufferedReader bufferedReaderader = new BufferedReader(new InputStreamReader(inputStream));

            List<String> resultList = new ArrayList<>();
            String line;

            while ((line = bufferedReaderader.readLine()) != null) {

                line = getMatch(line);

                if (line != null && !line.isEmpty()) {

                    resultList.add(line);
                }
            }

            System.out.println("result: " + resultList.toString());

        } catch (Exception e) {

            System.err.println(e);
        }
    }

    private static String getMatch(String line) {

        //regex a ser procurada
        Pattern pattern = Pattern.compile("(Event: )([\\d]+,[\\d]+)");
        Matcher matcher = pattern.matcher(line);
        String text = "";
        while (matcher.find()) {

            //indicar qual o grupo deseja obter o valor
            text = matcher.group(2);
        }

        return text;
    }
}
