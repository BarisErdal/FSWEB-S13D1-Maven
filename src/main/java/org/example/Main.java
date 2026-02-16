package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("Hello world!");

        System.out.println(hasTeen(9, 99, 19));

        System.out.println(hasTeen(23, 15, 42));

        System.out.println(hasTeen(22, 23, 34));

        System.out.println("Hello world!");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));


        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println(area(5.0));
        System.out.println(area(-1.0));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock > 23 || clock < 0 || !isBarking) {
            return false;

        }

        return clock > 19 || clock < 8;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return firstAge > 12 && firstAge < 20 || secondAge > 12 && secondAge < 20 || thirdAge > 12 && thirdAge < 20;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int topTemp = 35;
        if (isSummer) {
            topTemp = 45;
        }

        return temp >= 25 && temp <= topTemp;
    }

    public static double area(double width, double height) {

        if(width<0 || height<0) {return -1;}

        return width*height;
    }

    public static double area(double radius) {
        if(radius<0) {return -1;}

        return Math.PI*radius*radius;
    }


}
