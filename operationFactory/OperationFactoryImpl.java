package com.skillsup.calculator.operationFactory;

import com.skillsup.calculator.Operator;
import com.skillsup.calculator.operations.*;

/**
 * Created by Aleksey on 15.08.2017.
 */
public class OperationFactoryImpl implements OperationFactory {

    private String Symbols;



    @Override
    public Operation getOpInstance(){
        this.Symbols = ;
        switch (Symbols) {
            case Plus:
                return new OpPlus();
            case Min :
                return new OpMin();
            case Mul :
                return new OpMul();
            case Div :
                return new OpDiv();
            default: throw new IllegalArgumentException("required one of ariphmetic operations, but found  " + Symbols);
        }

    }


}
