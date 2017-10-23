package com.skillsup.calculator.operations;

import java.util.ArrayList;

/**
 * Created by Aleksey on 03.10.2017.
 */
public class OpNok implements Operation {

    @Override
    public double execute (double a, double b) {

        int result = 1;
        ArrayList <Integer> nokResult = new ArrayList<Integer>();
        NOK nok = new NOK();
        nokResult = nok.getMaxValues(a, b);

        for (int i = 0 ; i < nokResult.size() ; i++){
            result = result * nokResult.get(i);
        }


        return result;
    }



        private class NOK {
            private ArrayList<Integer> getMaxValues(double a, double b) {

                ArrayList<Integer> numbers1 = new ArrayList<Integer>();
                ArrayList<Integer> numbers2 = new ArrayList<Integer>();
                ArrayList<Integer> numbers = new ArrayList<Integer>();

                for (int i = 2; i <= a; i++) {
                    if (a % i == 0) {
                        numbers1.add(i);
                        a = a / i;
                        i = i - 1;
                    }
                }

                for (int i = 2; i <= b; i++) {
                    if (b % i == 0) {
                        numbers2.add(i);
                        b = b / i;
                        i = i - 1;

                    }
                }

                if (numbers1.size() >= numbers2.size()) {
                    for (int i = 0; i < numbers1.size(); i++){
                        numbers.add(numbers1.get(i));
                    }

                    for (int i = 0 ; i < numbers.size() ; i++){
                        for (int j = 0 ; j < numbers2.size() ; j++){
                            if (numbers.get(i).equals(numbers2.get(j))){
                                numbers2.remove(j);
                                break;
                            }
                            else continue;
                        }
                    }

                    for (int i = 0 ; i < numbers2.size() ; i++)
                        numbers.add(numbers2.get(i));

                } else {
                    for (int i = 0; i < numbers2.size(); i++) {
                        numbers.add(numbers2.get(i));
                    }

                    for (int i = 0; i < numbers.size(); i++) {
                        for (int j = 0; j < numbers1.size(); j++) {
                            if (numbers.get(i).equals(numbers1.get(j))) {
                                numbers1.remove(j);
                                break;
                            }
                            else continue;
                        }

                    }

                    for (int i = 0 ; i < numbers1.size() ; i++)
                        numbers.add(numbers1.get(i));
                }

                return numbers;
            }

        }

}
