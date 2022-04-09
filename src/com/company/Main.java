package com.company;

public class Main {

    public static void main(String[] args) {
        canPack(-3, 2, 12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("Invalid Input");
            return false;
        }

        int requiredBigCount;
        int requiredSmallCount;

        requiredBigCount = goal / (5);
        requiredSmallCount = goal - 5 * bigCount;

        System.out.println("Required big count = " + requiredBigCount);
        System.out.println("Available big count = " + bigCount);
        System.out.println("Small Count = " + smallCount);
        System.out.println("Required small count = " + requiredSmallCount);

        if (bigCount < requiredBigCount
                && smallCount >= requiredSmallCount) {
                System.out.println("There are enough count");
                return true;
        }

        if (bigCount >= requiredBigCount
                && smallCount >= (goal - 5 * requiredBigCount)) {
//            System.out.println(bigCount);
//            System.out.println(requiredBigCount);
//            System.out.println(smallCount);
//            System.out.println(goal-5*requiredBigCount);
            System.out.println("There are enough count");
            return true;
        } else
            System.out.println("Cannot be pack");
        return false;
    }
}
