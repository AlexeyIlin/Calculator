package com.skillsup.calculator;

/**
 * Created by Aleksey on 17.09.2017.
 */
public enum Operator {
    PLUS("+"),
    MIN("-"),
    MUL("*"),
    DIV("/"),
    ;
    String symbol;

    private Operator(String symbol){

        this.symbol=symbol;

    }

    public static Operator setOperator(String symbol) {
        if (symbol == "+")
                return PLUS;
            if (symbol == "-")
                return MIN;
                if (symbol == "*")
                    return DIV;
                    else return DIV;
    }

}
