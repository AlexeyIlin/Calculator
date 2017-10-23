package com.skillsup.calculator.operations;


import com.skillsup.calculator.exceptions.CannotCalculateException;

/**
 * Created by Aleksey on 20.08.2017.
 */
public class GreatestDivisor implements Operation {

    @Override
    public double execute (double a, double b) {

        double nodResult;
        NOD Nod = new NOD();
        nodResult = Nod.getCalculateNod(a, b);

        return nodResult;
    }

    private class NOD {
        private double getCalculateNod(double a, double b){
            try {
            if (a % 1 == 0 && b % 1 == 0)  {
                while (b != 0) {
                    double tmp = a % b;
                    a = b;
                    b = tmp;
                }
                return a;
            }
            else throw new CannotCalculateException("Нельзя посчтитать НОД для дробного числа");
            }
            catch (CannotCalculateException ex) {
                return 0;
            }
        }
    }

}
