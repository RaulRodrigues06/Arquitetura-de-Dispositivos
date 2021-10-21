package com.company;

public class ArrayUtilities {

    public static String toString(int[] array) {
        String str ="[";
        for (int i = 0; i < array.length; i++) {
            str += array[i] +",";
        }
        str+="]";
        return str;
    }

    public static int maximumOf(int[] array) {
        int maximum= array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }

    public static int minimumOf(int[] array) {
        int minimum=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        return minimum;
    }

    public static int[] copyOf(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           array2[i]= array[i];
        }
        return array2;
    }

    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j] && i != j) {
                    return true;
            }

            }
        }
        return false;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }


    public static int[] add(int[] array, int value) {
        int[] newArray=new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        newArray[newArray.length-1]=value;
        return newArray;
    }

    public static int[] remove(int[] array, int value) {
        int index = indexOf(array, value);
        if(index==-1){
            return array;
        }else{
            int[] newArray=new int[array.length-1];
            for (int i = 0; i < array.length; i++) {
                if(i < index){
                    newArray[i]=array[i];
                }else if(i != index){
                    newArray[i-1]=array[i];
                }
            }
            return newArray;
        }
    }
}
