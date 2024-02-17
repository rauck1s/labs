package org.example.lab6;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static List<Human> EqualsSecondName(List<Human> list, Human human){
        List<Human> resultList = new ArrayList<>();
        for(Human people: list){
            if(!people.getSecondName().equals(human.getSecondName())){
                resultList.add(people);
            }
        }
        return resultList;
    }
}
