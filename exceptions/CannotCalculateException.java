package com.skillsup.calculator.exceptions;

import static java.lang.System.*;

/**
 * Created by Aleksey on 03.10.2017.
 */
public class CannotCalculateException extends Exception{
    public CannotCalculateException (String message){
        super(message);
        out.println(message);
    }
}