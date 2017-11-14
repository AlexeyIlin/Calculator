package com.skillsup.calculator.io;

/**
 * Created by Aleksey on 12.10.2017.
 */
public class CalHolder {
    private double rightDigit;
    private double leftDigit;
    private String operator;

    public CalHolder (double leftDigit, double rightDigit, String operator){
        this.leftDigit = leftDigit;
        this.rightDigit = rightDigit;
        this.operator = operator;
    }

    public double getLeftDigit() {
        return leftDigit;
    }

    public double getRightDigit(){
        return rightDigit;
    }

    public String getOperators(){
        return operator;
    }



}
