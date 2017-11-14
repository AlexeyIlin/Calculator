package com.skillsup.calculator.exceptions;

import com.skillsup.calculator.db.StatisticsKeeper;

/**
 * Created by Aleksey on 03.10.2017.
 */
public class OperationNotFoundException extends Exception{
    public OperationNotFoundException(String message) {
        super(message);
        System.out.println(message);
        StatisticsKeeper.addResult("error");
    }
}
