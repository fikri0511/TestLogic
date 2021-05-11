package com.company;

import java.util.Scanner;

public class TestLogic001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seriesNumber = scanner.nextInt();
        int[] arraySeriesNumber = new int[seriesNumber];

        if (seriesNumber < 3 || seriesNumber > 2500) {
            System.out.println("Series Number range 3-2500");
        } else {
            // For input seriesNumber
            for (int i = 0; i < seriesNumber; i++) {
                arraySeriesNumber[i] = scanner.nextInt();
            }

            // For get differenceNumber
            int differeceNumber = arraySeriesNumber[1] - arraySeriesNumber[0];

            //Output
            System.out.println(missingTerm(arraySeriesNumber, differeceNumber));
        }

    }

    // Fuction for get the missing term
    private static int missingTerm(int[] arraySeriesNumber, int differenceNumber) {
        for (int i = 0; i < arraySeriesNumber.length - 1; i++) {
            if (arraySeriesNumber[i + 1] - arraySeriesNumber[i] != differenceNumber) {
                return arraySeriesNumber[i] + differenceNumber;
            }

        }
        return 0;
    }
}
