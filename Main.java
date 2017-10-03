package com.skillsup.calculator;

import com.skillsup.calculator.operationFactory.OperationFactoryImpl;
import com.skillsup.calculator.operations.GreatestDivisor;
import com.skillsup.calculator.operations.Operation;
import com.skillsup.calculator.exceptions.OperationNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aleksey on 12.08.2017.
 */


public class Main {
    public static void main(String [] args){

        BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
        String stringFromConsole = "";


        double number1 = 25.1, number2 = 50;
        String symbol = "8";

            Operator symbols = Operator.setOperator(symbol);


            OperationFactoryImpl MyOpFactory = new OperationFactoryImpl();
            Operation opInstance = MyOpFactory.getOpInstance(symbols);
            double result = opInstance.execute(number1, number2);

            GreatestDivisor MyNod = new GreatestDivisor();
            double nodResult = MyNod.execute(number1, number2);

            System.out.println("The result is " + result);
            System.out.println("The NOD is " + nodResult);

    }
}
