package com.skillsup.calculator.read;

import com.skillsup.calculator.Operator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


import static com.skillsup.calculator.Operator.PLUS;

/**
 * Created by Aleksey on 05.10.2017.
 */
public class ReadFile {

    private String fileName;
    private static String DIGIT_PATERN;

    public ReadFile(String fileName) {
        this.fileName = fileName;
        if (DIGIT_PATERN == null){
            StringBuilder stringBuilder = new StringBuilder();
            Operator[] operators = Operator.values();
            stringBuilder.append("[");
            for (Operator operator: operators) {
                stringBuilder.append(operator);
            }
            stringBuilder.append("]");
            DIGIT_PATERN = stringBuilder.toString();

        }
    }

    public CalHolder getData(){
        CalHolder calHolder = new CalHolder();
        try{
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = null;
            while (( strLine = br.readLine()) != null){
                for (char ch : strLine.toCharArray())
                {
                    StringBuilder stringBuilder = new StringBuilder();
                    if (Character.isDigit(ch) || ".".equals(ch))
                    {
                        stringBuilder.append(ch);
                    }
                    else if (" ".equals(ch))
                    {
                        ;
                    }

                }
                for(int i = 0; i < strLine.length(); i++) {

                    char ch = strLine.charAt(i);
                    if (Character.isDigit(ch))
                    {

                    }
                }
                String [] digits = strLine.split(DIGIT_PATERN);
                String [] operators = strLine.split("\\d | \\d\\.\\d");
                int k =digits.length;


            }

        }catch (IOException e){
            System.out.println("Ошибка чтения файла");
        }

        return calHolder;
    }

}
