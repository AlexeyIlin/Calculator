package com.skillsup.calculator;

/**
 * Created by Aleksey on 12.08.2017.
 */
public class Calculator implements OperationFactory, Operation {


    private double a;
    private double b;
    private String op;

    @Override
    public double execute(double a, double b) {
        this.a = a;
        this.b = b;
        return 0;
    }

    @Override
    public String getOpInstance(String op){
        this.op = op;
        return op;
    }


}