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

    private int[] createSortedArray() {
        int[] numbers = {1, 3, 8, 10, 12, 14, 20, 32, 50};
        return numbers;
    }


}