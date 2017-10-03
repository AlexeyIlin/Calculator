package com.skillsup.calculator;

import com.skillsup.calculator.exceptions.OperationNotFoundException;

/**
 * Created by Aleksey on 17.09.2017.
 */
public enum Operator {
    PLUS("+"),
    MIN("-"),
    MUL("*"),
    DIV("/"),
    ;
    String symbols;

    private Operator(String symbols){

        this.symbols=symbols;

    }

    public static Operator setOperator(String symbols) throws OperationNotFoundException {
        if (symbols == "+")
                return PLUS;
            if (symbols == "-")
                return MIN;
                if (symbols == "*")
                    return DIV;
                    if (symbols == "/")
                        return DIV;
                        else {
                        throw new OperationNotFoundException("Оператор не найден!");
                    }
    }

}
