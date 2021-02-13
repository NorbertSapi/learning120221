package com.company;

class Challenge{
    static int countTrue(boolean[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i]) {
                sum += 1;
                System.out.println(sum);
            }
            if(i == a.length-1){
                break;
            }
        }
        return sum;
    }
}
