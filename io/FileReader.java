package com.skillsup.calculator.io;

import com.skillsup.calculator.db.StatisticsKeeper;

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
public class FileReader {

    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public CalHolder getData(){
        CalHolder calHolder = null;
        String num1 = null;
        String num2 = null;
        String s = null;

        try{
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = null;
            while (( strLine = br.readLine()) != null){

                Matcher number1 = Pattern.compile("[0-9]*").matcher(strLine);
                Matcher symbol = Pattern.compile("[+,-,*,/]").matcher(strLine);
                Matcher number2 = Pattern.compile("[0-9]*$").matcher(strLine);
                if (number1.find() == true && symbol.find() == true && number2.find() == true){
                    num1 = number1.group();
                    s = symbol.group();
                    num2 = number2.group();
                }

                double leftDigit = Double.parseDouble(num1);
                double rightDigit = Double.parseDouble(num2);
                String operator = s;

                calHolder = new CalHolder(leftDigit, rightDigit, operator);
            }

        }catch (IOException e){
            System.out.println("Ошибка чтения файла");
            StatisticsKeeper.getInstance().addResult("error");
        }

        return calHolder;
    }

}
