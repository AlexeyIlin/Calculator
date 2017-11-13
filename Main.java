package com.skillsup.calculator;

import com.skillsup.calculator.io.WriteFile;
import com.skillsup.calculator.operationFactory.OperationFactoryImpl;
import com.skillsup.calculator.operations.GreatestDivisor;
import com.skillsup.calculator.operations.OpNok;
import com.skillsup.calculator.operations.Operation;
import com.skillsup.calculator.exceptions.OperationNotFoundException;
import com.skillsup.calculator.io.CalHolder;
import com.skillsup.calculator.io.ReadFile;
import com.skillsup.calculator.db.StatisticsKeeper;

import java.io.IOException;


/**
 * Created by Aleksey on 12.08.2017.
 */


public class Main {
    public static void main(String [] args) throws IOException, OperationNotFoundException {

        //double number1 =44, number2 = 33;
        String path = "C:\\Users\\Aleksey\\IdeaProjects\\Calculator\\src\\com\\skillsup\\calculator\\Data.txt";

        ReadFile read = new ReadFile(path);
        CalHolder calHolder = read.getData();
        double number1 = calHolder.getLeftDigit();
        double number2 = calHolder.getRightDigit();
        String symbol = calHolder.getOperators();

        Operator symbols = null;
        try {
            symbols = Operator.operatorValue(symbol);
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


        WriteFile write = new WriteFile(path);
        try {
            write.addToFile(result, nodResult, nokResult);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("The result is " + result);
        System.out.println("The NOD is " + nodResult);
        System.out.println("The NOK is " + nokResult);

    }
}
