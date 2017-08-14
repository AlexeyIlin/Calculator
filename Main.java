package com.skillsup.calculator;

/**
 * Created by Aleksey on 12.08.2017.
 */
public class Main {
    public static void main(String [] args){

        Calculator MyOpFactory = new Calculator();

        MyOpFactory.getOpInstance("+");
        MyOpFactory.execute(5, 6);


    }
}
