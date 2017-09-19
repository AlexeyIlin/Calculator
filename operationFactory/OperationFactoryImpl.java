package com.skillsup.calculator.operationFactory;

import com.skillsup.calculator.Operator;
import com.skillsup.calculator.operations.*;

/**
 * Created by Aleksey on 15.08.2017.
 */
public class OperationFactoryImpl implements OperationFactory {

    private String Symbols;



    @Override
    public Operation getOpInstance(Operator Symbols){
        switch (Symbols) {
            case PLUS:
                return new OpPlus();
            case MIN :
                return new OpMin();
            case MUL :
                return new OpMul();
            case DIV :
                return new OpDiv();
            default: throw new IllegalArgumentException("required one of ariphmetic operations, but found  " + Symbols);
        }

    }


}
