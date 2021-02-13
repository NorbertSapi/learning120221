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

        /*

        int count = 0;
        int sum = 0;

        for(int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println("number = " + i);
                sum += i;
            }
            if(count == 5){
                break;
            }
        }
    System.out.println(sum);
    }
}
/*
for(int number = 1; number < 100; number++) {
        if (number % 3 == 0 && number % 5 == 0) {
        System.out.println("number = " + number);
        }
        }

PSEUDO CODE - CounterApp                                            count       number
    for loop -> number +1                                   1.          0           0
        int count = 0                                       2.          0           0
        if number -> TRUE             -> %3 && %5           3.          0           0
            for loop -> count +1                            4.          1           15
                if count < 5          -> count < 5          5.          1           15
                    break                                   6.          1           15
*/

