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

        Operator Symbols = Operator.valueOf(symbol);


            OperationFactoryImpl MyOpFactory = new OperationFactoryImpl();
            Operation opInstance = MyOpFactory.getOpInstance(Symbols);
            double result = opInstance.execute(number1, number2);

            GreatestDivisor MyNod = new GreatestDivisor();
            double nodResult = MyNod.execute(number1, number2);

            System.out.println("The result is " + result);
            System.out.println("The NOD is " + nodResult);

    }
}
