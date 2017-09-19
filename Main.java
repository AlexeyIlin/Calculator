package com.skillsup.calculator;

import com.skillsup.calculator.operationFactory.OperationFactoryImpl;
import com.skillsup.calculator.operations.GreatestDivisor;
import com.skillsup.calculator.operations.Operation;

/**
 * Created by Aleksey on 12.08.2017.
 */


public class Main {
    public static void main(String [] args){


        double number1 = 25.1, number2 = 50;
        String symbol = "+";

        Operator operator;
        try {
            if (symbol == "+")
                operator = Operator.Plus;
            else if (symbol == "-")
                operator = Operator.Min;
            else if (symbol == "x")
                operator = Operator.Mul;
            else if (symbol == "/")
                operator = Operator.Div;
            else throw new IllegalArgumentException("Wrong symbol");
        } catch (Exception ex) {
            System.err.println("Operation is not correct" + Operator.valueOf("Other"));
        }

            OperationFactoryImpl MyOpFactory = new OperationFactoryImpl();
            Operation opInstance = MyOpFactory.getOpInstance();
            double result = opInstance.execute(number1, number2);

            GreatestDivisor MyNod = new GreatestDivisor();
            double nodResult = MyNod.execute(number1, number2);

            System.out.println("The result is " + result);
            System.out.println("The NOD is " + nodResult);

    }
}
