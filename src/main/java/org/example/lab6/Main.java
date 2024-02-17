package org.example.lab6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human first = new Human("dimas", "dims", "dmitrisg", 111);
        Human second = new Human("disfd", "dimsdf", "dmitrinksg", 110);
        Human third = new Human("dimas", "dimsaf", "dmitrinbk", 103);
        Human fort = new Human("dimasgfg", "dimsasd", "dmitriaf", 10);
        Human res = new Human("dimas", "dims", "dmitri", 10);
        List<Human> testList = new ArrayList<>();
        testList.add(first);
        testList.add(second);
        testList.add(third);
        testList.add(fort);
        List<String> testListStr = new ArrayList<>();
        testListStr.add("qwer");
        testListStr.add("wqer");
        testListStr.add("nbska");
        testListStr.add("1wer");
        testListStr.add("qwer");
        if (2 ==CollectionsDemo.sortByFirstSymbol(testListStr, 'q')){
            System.out.println("true");
        }
    }
}
