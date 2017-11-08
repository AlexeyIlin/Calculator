package com.skillsup.calculator.io;

/**
 * Created by Aleksey on 12.10.2017.
 */
public class CalHolder {
    private double rightDigit;
    private double leftDigit;
    private String operator;

    public CalHolder (){
    }

    public double getLeftDigit() {
        return leftDigit;
    }

    public void setLeftDigit(double leftDigit) {
        this.leftDigit = leftDigit;
    }

    public void setRightDigit (double rightDigit){
        this.rightDigit = rightDigit;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getRightDigit(){
        return rightDigit;
    }

    public String getOperators(){
        return operator;
    }



}
