package com.skillsup.calculator;

/**
 * Created by Aleksey on 20.08.2017.
 */
public class GreatestDivisor implements Operation {

    private double a, b;

    @Override
    public double execute (double a, double b) {

        double nodResult;
        this.a = a;
        this.b = b;
        NOD Nod = new NOD();
        nodResult = Nod.getCalculateNod(a, b);

        return nodResult;
    }

    private class NOD {
        private double getCalculateNod(double a, double b){
            while (b !=0) {
                double tmp = a%b;
                a = b;
                b = tmp;
            }
            return a;
        }
    }

}
