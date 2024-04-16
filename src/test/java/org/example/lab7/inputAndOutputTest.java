package org.example.lab7;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    void thirdBinaryStreamExample() throws IOException {

        RandomAccessFile writer = new RandomAccessFile("thirdExample.txt", "rw");
        for (int i = 0; i < 10; i++) {
            writer.writeInt(i);
        }
        writer.close();

        int[] outputArray = new int[]{5,6,7,8,9};

        assertArrayEquals(outputArray,inputAndOutput.thirdBinaryStreamExample(5, "thirdExample.txt"));
    }

    @Test
    void getFiles(){
        List<String> output = new ArrayList<>();
        output.add("firstExample.txt");
        output.add("secondExample.txt");
        output.add("thirdExample.txt");
        assertEquals(output, inputAndOutput.getFiles("C:\\Users\\Dmitri\\IdeaProjects\\labs", ".txt"));

    }
}