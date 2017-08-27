package com.skillsup.calculator;

/**
 * Created by Aleksey on 15.08.2017.
 */
public class OperationFactoryImpl implements OperationFactory {

    private String op;

    @Override
    public Operation getOpInstance(String op){
        this.op = op;
        switch (op) {
            case "+" :
                return new OpPlus();
            case "-" :
                return new OpMin();
            case "x" :
                return new OpMul();
            case "/" :
                return new OpDiv();
            default: throw new IllegalArgumentException("required one of ariphmetic operations, but found  " + op);
        }

    }


}
