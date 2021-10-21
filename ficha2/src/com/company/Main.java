package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int power = NumericalUtilities.powerOf(2,2);
        System.out.println(power);
        int sum = NumericalUtilities.sumOfNaturalNumbersUpTo(10);
        System.out.println(sum);
        int between = NumericalUtilities.sumOfNaturalNumbersBetween(5,10);
        System.out.println(between);
        int evenNumbers = NumericalUtilities.sumOfEvenNumbersBetween(5,10);
        System.out.println(evenNumbers);
        int division = NumericalUtilities.numberOfDivisorsOf(10);
        System.out.println(division);
        boolean prime= NumericalUtilities.isPrime(6);
        System.out.println(prime);

        // Exercicio 2

        int[] array={1,2,3,4};

        String str = ArrayUtilities.toString(array);
        System.out.println(str);
        int max = ArrayUtilities.maximumOf(array);
        System.out.println(max);
        int min = ArrayUtilities.minimumOf(array);
        System.out.println(min);
        int[] copy = ArrayUtilities.copyOf(array);
        System.out.println(ArrayUtilities.toString(copy));
        boolean contain= ArrayUtilities.contains(array,5);
        System.out.println(contain);
        boolean duplicate= ArrayUtilities.containsDuplicates(array);
        System.out.println(duplicate);
        int index= ArrayUtilities.indexOf(array, 5);
        System.out.println(index);
        int[] add = ArrayUtilities.add(array, 9);
        System.out.println(ArrayUtilities.toString(add));
        int[] remove = ArrayUtilities.remove(array, 2);
        System.out.println(ArrayUtilities.toString(remove));
    }
}

