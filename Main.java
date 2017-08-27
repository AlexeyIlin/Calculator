package com.skillsup.calculator;

/**
 * Created by Aleksey on 12.08.2017.
 */
public class Main {
    public static void main(String [] args){

        double number1 = 25.1, number2 = 50;
        String symbol = "+";

            OperationFactoryImpl MyOpFactory = new OperationFactoryImpl();
            Operation opInstance = MyOpFactory.getOpInstance(symbol);
            double result = opInstance.execute(number1, number2);

            GreatestDivisor MyNod = new GreatestDivisor();
            double nodResult = MyNod.execute(number1, number2);

            System.out.println("The result is " + result);
            System.out.println("The NOD is " + nodResult);

    }
}
