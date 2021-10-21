package com.company;

public class NumericalUtilities {

    public static int powerOf(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static int sumOfNaturalNumbersUpTo(int natural) {
        int sum=0;
        for (int i = 0; i <= natural ; i++) {
            sum +=i;
        }
        return sum;
    }

    public static int sumOfNaturalNumbersBetween(int start, int end) {
        int sum=0;
        for (int i = start; i <= end ; i++) {
            sum +=i;
        }
        return sum;
    }

    public static int sumOfEvenNumbersBetween(int start, int end) {
        int sum=0;
        for (int i = start; i <= end ; i++) {
            if(i%2==0){
                sum +=i;
            }
        }
        return sum;
    }

    public static int numberOfDivisorsOf(int number) {
        int div=0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                div++;
            }
        }
        return div;
    }

    public static boolean isPrime(int number) {
        if(numberOfDivisorsOf(number)==2){
            return true;
        }else{
            return false;
        }
    }
}
