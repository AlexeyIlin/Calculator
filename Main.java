package com.skillsup.calculator;

import com.skillsup.calculator.operationFactory.OperationFactoryImpl;
import com.skillsup.calculator.operations.GreatestDivisor;
import com.skillsup.calculator.operations.OpNok;
import com.skillsup.calculator.operations.Operation;
import com.skillsup.calculator.exceptions.OperationNotFoundException;
import com.skillsup.calculator.read.CalHolder;
import com.skillsup.calculator.read.ReadFile;


/**
 * Created by Aleksey on 12.08.2017.
 */


public class Main {
    public static void main(String [] args) {

        //double number1 =44, number2 = 33;
        //String symbol = "+";

        ReadFile read = new ReadFile("C:\\Users\\Aleksey\\IdeaProjects\\Calculator\\src\\Data.txt");
        CalHolder calHolder = read.getData();
        double number1 = calHolder.getLeftDigit();
        double number2 = calHolder.getRightDigit();
        String symbol = calHolder.getOperators();

        Operator symbols = null;
        try {
            symbols = Operator.setOperator(symbol);
        } catch (OperationNotFoundException ex) {
            System.out.println(ex);
        }

        OperationFactoryImpl myOpFactory = new OperationFactoryImpl();
        Operation opInstance = myOpFactory.getOpInstance(symbols);
        double result = opInstance.execute(number1, number2);

        GreatestDivisor myNod = new GreatestDivisor();
        double nodResult = myNod.execute(number1, number2);

        OpNok myNok = new OpNok();
        double nokResult = myNok.execute(number1, number2);

        System.out.println("The result is " + result);
        System.out.println("The NOD is " + nodResult);
        System.out.println("The NOK is " + nokResult);

    }
}
