package com.company;


public class Main {

// the problem is: you have to count and return how many true is in a given array. If value is false, or array is empty
// the program has to return 0.
    public static void main(String[] args) {
        boolean[] first = {true, false, false, false, true, false, true, false, false, true};
        boolean[] second = {false, false, false, true, false, true, false, false, false};
        boolean[] third = {false, false, false};
        boolean[] zero = {};

        int result = Challenge.countTrue(first);
        System.out.println("result first = " + result);

        result = Challenge.countTrue(second);
        System.out.println("result second = " + result);

        result = Challenge.countTrue(zero);
        System.out.println("result zero = " + result);

        result = Challenge.countTrue(third);
        System.out.println("result third = " + result);

    }
}
