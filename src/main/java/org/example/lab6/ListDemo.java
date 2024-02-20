package org.example.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListDemo {
    static List<Human> EqualsSecondName(List<Human> list, Human human){
        List<Human> resultList = new ArrayList<>();
        for(Human people: list){
            if(people.getSecondName().equals(human.getSecondName())){
                resultList.add(people);
            }
        }
        return resultList;
    }
    //FIXME: задание 5, сразу с тестом написать
    /*static List<Set<Human>> maxAge(List<Human> inputList){
    }*/

}
