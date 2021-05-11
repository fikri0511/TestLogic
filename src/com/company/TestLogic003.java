package com.company;

import java.util.Scanner;

public class TestLogic003 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(numPrime(input));
    }

    private static int numPrime(int max) {
        int toReturn = 0;
        for (int i = 0; i < max; i++)
            toReturn += (checkPrime(i)) ? 1 : 0;
        return toReturn;
    }
    private static boolean checkPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        int sqrtNumber = (int) Math.sqrt(number) + 1;
        for (int i = 6; i <= sqrtNumber; i += 6) {
            if (number % (i - 1) == 0 || number % (i + 1) == 0) return false;
        }
        return true;


    }
}
