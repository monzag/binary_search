package com.monzag;

import java.util.Arrays;

public class BinarySearch {

    public Boolean search(int[] numbers, int toFind) {
        int[] sortedNumbers = sort(numbers);
        int startPoint = 0;
        int endPoint = sortedNumbers.length - 1;
        Boolean notFound = true;
        while (notFound) {
            int middlePoint = (startPoint + endPoint) / 2;

            if (startPoint > endPoint) {
                notFound = false;

            } if (sortedNumbers[middlePoint] == toFind) {
                return true;

            } if (sortedNumbers[middlePoint] > toFind) {
                endPoint = middlePoint - 1;

            } else {
                startPoint = middlePoint + 1;
            }
        }
        return notFound;
    }

    private int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
