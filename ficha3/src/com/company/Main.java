package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char letter = 'c';

        // 1

        char lowerLetter = CharacterUtilities.lowerLetterSuccessorOf(letter);
        System.out.println(lowerLetter);

        //2

        char lowerLetterPredecessor = CharacterUtilities.lowerLetterPredecessorOf(letter);
        System.out.println(lowerLetterPredecessor);

        //3

        char lowerLetterSuccessor = CharacterUtilities.lowerLetterSuccessorStepsOf(letter,5);
        System.out.println(lowerLetterSuccessor);

        //4

        char lowerLetterPredecessorSteps = CharacterUtilities.lowerLetterPredecessorStepsOf(letter,5);
        System.out.println(lowerLetterPredecessorSteps);

        //5

        char[] array={'a','b','c','a','d','a'};
        char[] array2={'e','f','g','h','v','l'};

        int occurrencesOfCharacter = CharacterUtilities.occurrencesOfCharacterIn(array,'a');
        System.out.println("The letter repeats " + occurrencesOfCharacter + " times");

        //6

        char[] replaceCharacter = CharacterUtilities.replaceCharacterIn(array,'a', 'b');
        System.out.println(replaceCharacter);

        //7

        char[] concatenation = CharacterUtilities.concatenationOf(array,array2);
        System.out.println(concatenation);

        //8

        char[] copyOfPart = CharacterUtilities.copyOfPartOf(array, 2, 5);
        System.out.println(copyOfPart);

        //Parte 2

        String str="ahfuehf";

        //1

        String cipher = CaesarCipherDecipherer.cipher(str,5);
        System.out.println(cipher);

        //2

        String  decipher= CaesarCipherDecipherer.decipher(str,5);
        System.out.println(decipher);
    }
}