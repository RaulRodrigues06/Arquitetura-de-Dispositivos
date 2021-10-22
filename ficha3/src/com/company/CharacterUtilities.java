package com.company;

public class CharacterUtilities {

    public static char lowerLetterSuccessorOf(char letter) {
        if(letter == 'z'){
            return 'a';
        }else {
            int code = (int) letter;
            code++;
            char newChar = (char) code;
            return newChar;
        }
    }

    public static char lowerLetterPredecessorOf(char letter) {
        if(letter == 'a'){
            return 'z';
        }else {
            int code = (int) letter;
            code--;
            char newChar = (char) code;
            return newChar;
        }
    }


    public static char lowerLetterSuccessorStepsOf(char letter, int steps) {
        char newLetter = letter;
        while (steps != 0){
            newLetter=lowerLetterSuccessorOf(newLetter);
            steps --;
        }
        return newLetter;
    }

    public static char lowerLetterPredecessorStepsOf(char letter, int steps) {
        char newLetter = letter;
        while (steps != 0){
            newLetter=lowerLetterPredecessorOf(newLetter);
            steps --;
        }
        return newLetter;
    }

    public static int occurrencesOfCharacterIn(char[] array, char character) {
        int repeat=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==character) {
                repeat ++ ;
            }
        }
        return repeat;
    }

    public static char[] replaceCharacterIn(char[] array, char characterOld, char characterNew) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == characterOld){
                array[i]=characterNew;
            }
        }
        return array;
    }

    public static char[] concatenationOf(char[] array, char[] array2) {
        char[] newArray = new char[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[j+ array.length]=array2[j];
        }
        return newArray;
    }

    public static char[] copyOfPartOf(char[] array, int start, int end) {
        char[] newArray = new char[(end-start)+1];
        int index =0;

        for (int i = start; i <= end; i++) {
            newArray[index]=array[i];
            index ++;
        }
        return newArray;
    }
}

