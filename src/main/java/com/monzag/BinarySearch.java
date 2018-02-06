package com.monzag;

public class BinarySearch {

    public Boolean search(int[] numbers, int toFind) {
        numbers = sort(numbers);
        int startPoint = 0;
        int endPoint = numbers.length - 1;
        Boolean notFound = true;
        while (notFound) {
            int middlePoint = (startPoint + endPoint) / 2;

            if (startPoint > endPoint) {
                notFound = false;

            } if (numbers[middlePoint] == toFind) {
                return true;

            } if (numbers[middlePoint] > toFind) {
                endPoint = middlePoint - 1;

            } else {
                startPoint = middlePoint + 1;
            }
        }
        return notFound;
    }
}
