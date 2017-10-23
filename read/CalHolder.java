package com.skillsup.calculator.read;

import com.skillsup.calculator.Operator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 12.10.2017.
 */
public class CalHolder {
    private double rightDigit;
    private double leftDigit;
    private Operator operator;

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

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public double getRightDigit(){
        return rightDigit;
    }

    public Operator getOperators(){
        return operator;
    }



}
