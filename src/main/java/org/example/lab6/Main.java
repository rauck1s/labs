package org.example.lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human first = new Human("dimas", "dims", "dmit", 10);
        Human second = new Human("disfd", "di", "dmit", 110);
        Human third = new Human("dimas", "dims", "dmitrinbk", 103);
        Human fort = new Human("dimasgfg", "di", "dmitriaf", 10);
        Human res = new Human("dimas", "dims", "dmit", 10);
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
        List<Integer[]> testInt = new ArrayList<>();
        Integer[] firsT = new Integer[]{1,1,3,4,4};
        Integer[] seco = new Integer[]{1,1,3,4,5};
        Integer[] thir = new Integer[]{1,1,3,4,1};
        Integer[] testtinggg = new Integer[]{1,1,3,4,5};
        testInt.add(firsT);
        testInt.add(seco);
        testInt.add(thir);
    }
}
