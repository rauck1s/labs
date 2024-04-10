package org.example.lab7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputAndOutputTest {

    @Test
    void firstBinaryStreamExample() {

        int[] inputArray = new int[]{1,2,3,4,5,6};
        int[] outputArray = new int[]{1,2,3,4,5,6};

        assertArrayEquals(outputArray,inputAndOutput.firstBinaryStreamExample(inputArray, "firstExample"));
    }

    @Test
    void secondBinaryStreamExample(){

        int[] inputArray = new int[]{1,2,3,4,5,6};
        int[] outputArray = new int[]{1,2,3,4,5,6};

        assertArrayEquals(outputArray,inputAndOutput.secondBinaryStreamExample(inputArray, "secondExample"));
    }
}