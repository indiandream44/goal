package com.naveen.math;

public class PrimeNumber2 {

    public static void main(String args[]) {
        int i, m = 0;
        boolean flag = true;
        int n = 11;// it is the number to be checked4
        m = n / 2;
        for (i = 2; i <= m; i++) {
            if (n % i == 0) {
                System.out.println("Number is not prime");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Number is prime");
    }
}
