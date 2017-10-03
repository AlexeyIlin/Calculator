package com.skillsup.calculator.exceptions;

import static java.lang.System.*;

/**
 * Created by Aleksey on 03.10.2017.
 */
public class CannotCalculateNodException extends Exception{
    public CannotCalculateNodException (String message){
        super(message);
        out.println(message);
    }
}
