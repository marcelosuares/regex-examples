package br.com.examples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * procura na lista o casamento com a regex, se enconta coloca na lista de
 * resultados
 */
public class ValidateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>();

        inputList.add("(16)9.9985-8954");
        inputList.add("(16)998452574");
        inputList.add("(16)9.9521-4521");
        inputList.add("9.8475-8752");
        inputList.add("16984575214");

        List<String> resultList = new ArrayList<>();

        for (String phoneNumber : inputList) {

            //regex a ser procurada     
            if (phoneNumber.matches("^\\(16\\)[\\d]\\.[\\d]+-[\\d]+")) {

                resultList.add(phoneNumber);
            }
        }

        System.out.println("result: " + resultList.toString());
    }

}
