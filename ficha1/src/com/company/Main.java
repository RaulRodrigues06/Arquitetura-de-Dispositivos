package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        float perimeter = calculateRectanglePerimeter(5, 10);
        System.out.println("Rectangle perimeter is: " + perimeter);
        float volume = calculateVolumeParallepiped(5, 10, 5);
        System.out.println("Paralleliped volume is: " + volume);
        System.out.println("Temperature in centigrades is: " + calculateTemperatureCentigrades(32) + " degrees");
        System.out.println("Time in to seconds: " + convertFromTimeToSeconds(5,8,45));
        int[] array={10,5,4,3};
        System.out.println(max(array));
        System.out.println(min(array));
        System.out.println(average(array));

    }
    public static float calculateRectanglePerimeter(float width, float height){
        float perimeter = 2*(width+height);
        return perimeter;
    }

    public static float calculateVolumeParallepiped(float height, float width, float length){
        float volume = height * width * length;
        return volume;
    }
    public static float calculateTemperatureCentigrades(float temperature){
        float centigrades=(temperature-32)*5/9;
        return centigrades;
    }
    public static float convertFromTimeToSeconds(int hours, int minutes, int seconds ){
        return hours * 3600 + minutes * 60 + seconds;
    }
    public static int max(int array[] ){
        int number=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i]>number){
                number=array[i];
            }
        }
        return number;
    }
    public static int min(int array[] ){
        int number=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i]<number){
                number=array[i];
            }
        }
        return number;
    }
    public static float average(int array[] ){
        float sum=0;
        for (int i=1; i<array.length; i++){
            sum+=array[i];
        }
        float average=sum/ array.length;
        return average;
    }
}
