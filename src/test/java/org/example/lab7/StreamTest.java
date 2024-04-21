package org.example.lab7;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    @Test
    void FirstTask() {

        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] outputArray = new int[]{1, 2, 3, 4, 5, 6};

        Stream.inputStream(inputArray, "firstTask.txt");

        assertArrayEquals(outputArray, Stream.outputStream("firstTask.txt"));
    }

    @Test
    void secondTask() {

        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] outputArray = new int[]{1, 2, 3, 4, 5, 6};

        Stream.inputStreamWithSpaces(inputArray, "secondTask.txt");

        assertArrayEquals(outputArray, Stream.outputStreamWithSpaces("secondTask.txt"));
    }

    @Test
    void thirdBinaryStreamExample() throws IOException {

        int[] arr = {1, 2, 3, 4, 5, 6};
        Stream.inputStream(arr, "thirdTask.txt");
        int[] expectedArr = {4, 5, 6};
        assertArrayEquals(expectedArr, Stream.outputStreamWithPosition(3, "thirdTask.txt", 3));

    }



@Test
void getFiles() {
    List<String> output = new ArrayList<>();
    output.add("firstTask.txt");
    output.add("secondTask.txt");
    output.add("thirdTask.txt");
    assertEquals(output, Stream.getFiles("C:\\Users\\Dmitri\\IdeaProjects\\labs", ".txt"));

}
}