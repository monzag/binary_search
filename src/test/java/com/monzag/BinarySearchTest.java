package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearcher;

    @BeforeEach
    void setup() {
        binarySearcher = new BinarySearch();
    }

    @Test
    void testConstructor() {
        BinarySearch searcher = new BinarySearch();
    }

    @Test
    void testSearchFirstNumber() {
        assertTrue(binarySearcher.search(createSortedArray(), 1));
    }

    @Test
    void testSearchLastNumber() {
        assertTrue(binarySearcher.search(createSortedArray(), 50));
    }

    @Test
    void testSearchMiddleNumber() {
        assertTrue(binarySearcher.search(createSortedArray(), 12));
    }

    @Test
    void testSearchNumber() {
        assertTrue(binarySearcher.search(createSortedArray(), 8));
    }

    @Test
    void testNotExistNumber() {
        assertFalse(binarySearcher.search(createSortedArray(), 100));
    }

    @Test
    void testSearchNumberFromNotSortedArray() {
        int[] numbers = {100, 3, 8, 5, 12, 14, 1, 32, 50};
        assertTrue(binarySearcher.search(numbers, 8));
    }

    @Test
    void testSearchNegativeNumber() {
        int[] numbers = {-3, -1, 3, 8, 12, 14, 16, 32, 51};
        assertTrue(binarySearcher.search(numbers, -1));
    }

    private int[] createSortedArray() {
        int[] numbers = {1, 3, 8, 10, 12, 14, 20, 32, 50};
        return numbers;
    }
}