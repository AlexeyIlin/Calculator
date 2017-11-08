package com.skillsup.calculator.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Aleksey on 05.10.2017.
 */
public class ReadFile {

    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public CalHolder getData(){
        CalHolder calHolder = new CalHolder();
        ArrayList <String> list = new ArrayList<String>();
        try{
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = null;
            while (( strLine = br.readLine()) != null){

                Matcher number1 = Pattern.compile("[0-9]*").matcher(strLine);
                Matcher symbol = Pattern.compile("[+,-,*,/]").matcher(strLine);
                Matcher number2 = Pattern.compile("[0-9]*$").matcher(strLine);
                if (number1.find() == true && symbol.find() == true && number2.find() == true){
                    list.add(number1.group());
                    list.add(symbol.group());
                    list.add(number2.group());
                }

                double leftDigit = Integer.parseInt(list.get(0));
                double rightDigit = Integer.parseInt(list.get(2));
                String operator = list.get(1);

                calHolder.setLeftDigit(leftDigit);
                calHolder.setRightDigit(rightDigit);
                calHolder.setOperator(operator);
            }

        }catch (IOException e){
            System.out.println("Ошибка чтения файла");
        }

        return calHolder;
    }

}
