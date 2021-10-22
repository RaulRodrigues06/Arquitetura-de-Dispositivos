package com.company;

public class CaesarCipherDecipherer {

    public static String cipher(String str, int steps) {
        String cipherdStr="";
        for (int i = 0; i < str.length(); i++) {
            cipherdStr += CharacterUtilities.lowerLetterSuccessorStepsOf(str.charAt(i),steps);
        }
        return cipherdStr;
    }

    public static String decipher(String str, int steps) {
        String decipherdStr="";
        for (int i = 0; i < str.length(); i++) {
            decipherdStr += CharacterUtilities.lowerLetterPredecessorStepsOf(str.charAt(i),steps);
        }
        return decipherdStr;
    }
}
