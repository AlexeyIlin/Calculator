package com.skillsup.calculator;

/**
 * Created by Aleksey on 12.08.2017.
 */
public interface OperationFactory {
    Operation getOpInstance(String op);
}
