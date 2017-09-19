package com.skillsup.calculator.operationFactory;

import com.skillsup.calculator.operations.Operation;

/**
 * Created by Aleksey on 12.08.2017.
 */
public interface OperationFactory {
    Operation getOpInstance(String op);
}
