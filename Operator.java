package com.skillsup.calculator;

import com.skillsup.calculator.exceptions.OperationNotFoundException;

/**
 * Created by Aleksey on 17.09.2017.
 */
public enum Operator {
    PLUS("+"),
    MUL("*"),
    MIN("-"),
    DIV("/"),
    ;
    String symbols;

    private Operator(String symbols){

        this.symbols=symbols;

    }

    public static Operator setOperator(String symbols) throws OperationNotFoundException {
        if (symbols.equals("+"))
                return PLUS;
            if (symbols.equals("-"))
                return MIN;
                if (symbols.equals("*"))
                    return MUL;
                    if (symbols.equals("/"))
                        return DIV;
                        else {
                        throw new OperationNotFoundException("Оператор не найден!");
                    }
    }

    @Override
    public String toString() {
        return symbols;
    }
}
